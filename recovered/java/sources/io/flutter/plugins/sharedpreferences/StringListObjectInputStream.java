            package io.flutter.plugins.sharedpreferences;

            import java.io.IOException;
            import java.io.InputStream;
            import java.io.ObjectInputStream;
            import java.io.ObjectStreamClass;
            import java.util.Set;
            import kotlin.Metadata;
            import p000.C2103qd;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/StringListObjectInputStream;", "Ljava/io/ObjectInputStream;", "input", "Ljava/io/InputStream;", "<init>", "(Ljava/io/InputStream;)V", "resolveClass", "Ljava/lang/Class;", "desc", "Ljava/io/ObjectStreamClass;", "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class StringListObjectInputStream extends ObjectInputStream {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public StringListObjectInputStream(InputStream inputStream) {
/* 4 */             super(inputStream);
/* 1 */             inputStream.getClass();
                }

                @Override // java.io.ObjectInputStream
                public Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {
/* 13 */            Set setM7780o = C2103qd.m7780o(new String[]{"java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;"});
/* 24 */            String name = desc != null ? desc.getName() : null;
/* 25 */            if (name == null || setM7780o.contains(name)) {
/* 44 */                return super.resolveClass(desc);
                    }
/* 43 */            throw new ClassNotFoundException(desc.getName());
                }
            }
