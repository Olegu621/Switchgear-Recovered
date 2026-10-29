            package com.google.gson;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Field;
            import java.lang.reflect.Type;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class FieldAttributes {
                private final Field field;

                public FieldAttributes(Field field) {
/* 4 */             Objects.requireNonNull(field);
/* 7 */             this.field = field;
                }

                public <T extends Annotation> T getAnnotation(Class<T> cls) {
/* 3 */             return (T) this.field.getAnnotation(cls);
                }

                public Collection<Annotation> getAnnotations() {
/* 7 */             return Arrays.asList(this.field.getAnnotations());
                }

                public Class<?> getDeclaredClass() {
/* 3 */             return this.field.getType();
                }

                public Type getDeclaredType() {
/* 3 */             return this.field.getGenericType();
                }

                public Class<?> getDeclaringClass() {
/* 3 */             return this.field.getDeclaringClass();
                }

                public String getName() {
/* 3 */             return this.field.getName();
                }

                public boolean hasModifier(int i) {
                    return (this.field.getModifiers() & i) != 0;
                }

                public String toString() {
/* 3 */             return this.field.toString();
                }
            }
