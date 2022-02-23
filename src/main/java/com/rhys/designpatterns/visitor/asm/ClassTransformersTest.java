package com.rhys.designpatterns.visitor.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.objectweb.asm.Opcodes.ASM4;
import static org.objectweb.asm.Opcodes.INVOKESTATIC;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 1:09 上午
 */
public class ClassTransformersTest {
    public static void main(String[] args) throws IOException {
        ClassReader cr = new ClassReader(ClassPrinter.class.getClassLoader().getResourceAsStream("com/rhys/designpatterns/visitor/asm/Tank.class"));
        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new ClassVisitor(ASM4, cw) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
                return new MethodVisitor(ASM4, mv) {
                    @Override
                    public void visitCode() {
                        visitMethodInsn(INVOKESTATIC, "TimeProxy", "before", "()V", false);
                        super.visitCode();
                    }
                };
            }
        };
        cr.accept(cv, 0);
        byte[] bytes = cw.toByteArray();
        String path = (String) System.getProperties().get("user.dir");
        File file = new File(path + "/com/rhys/designpatterns/visitor/asm");
        file.mkdirs();

        FileOutputStream fileOutputStream = new FileOutputStream(new File(path + "/com/rhys/designpatterns/visitor/asm/Tank_0.class"));
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
