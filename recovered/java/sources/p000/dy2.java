            package p000;

            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            import java.io.Serializable;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class dy2 implements p51, Serializable {

                /* JADX INFO: renamed from: a */
                public Function0 f7446a;

                /* JADX INFO: renamed from: b */
                public Object f7447b;

                private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
/* 8 */             throw new InvalidObjectException("Deserialization is supported via proxy only");
                }

                private final Object writeReplace() {
/* 7 */             return new vx0(getValue());
                }

                @Override // p000.p51
                public final Object getValue() {
/* 5 */             if (this.f7447b == xw2.f19388a) {
/* 7 */                 Function0 function0 = this.f7446a;
/* 9 */                 function0.getClass();
/* 16 */                this.f7447b = function0.invoke();
/* 19 */                this.f7446a = null;
                    }
/* 21 */            return this.f7447b;
                }

                @Override // p000.p51
                public final boolean isInitialized() {
                    return this.f7447b != xw2.f19388a;
                }

                public final String toString() {
                    return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
                }
            }
