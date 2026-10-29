            package p000;

            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            import java.io.Serializable;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class m02 extends n02 implements Serializable {
                public m02(DefaultConstructorMarker defaultConstructorMarker) {
                }

                private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
/* 8 */             throw new InvalidObjectException("Deserialization is supported via proxy only");
                }

                private final Object writeReplace() {
/* 1 */             return l02.f13068a;
                }

                @Override // p000.n02
                /* JADX INFO: renamed from: a */
                public final int mo1470a(int i) {
/* 3 */             return n02.f14090b.mo1470a(i);
                }

                @Override // p000.n02
                /* JADX INFO: renamed from: b */
                public final int mo1471b() {
/* 3 */             return n02.f14090b.mo1471b();
                }

                @Override // p000.n02
                /* JADX INFO: renamed from: c */
                public final int mo1167c() {
                    throw null;
                }
            }
