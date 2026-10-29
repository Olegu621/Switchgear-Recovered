            package p000;

            import java.io.Serializable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ne0 implements Serializable {

                /* JADX INFO: renamed from: b */
                private static final me0 f14207b = new me0(null);

                /* JADX INFO: renamed from: a */
                public final Class f14208a;

                public ne0(Enum[] enumArr) {
/* 1 */             enumArr.getClass();
/* 11 */            Class<?> componentType = enumArr.getClass().getComponentType();
/* 15 */            componentType.getClass();
/* 18 */            this.f14208a = componentType;
                }

                private final Object readResolve() {
/* 3 */             Object[] enumConstants = this.f14208a.getEnumConstants();
/* 7 */             enumConstants.getClass();
/* 14 */            return new le0((Enum[]) enumConstants);
                }
            }
