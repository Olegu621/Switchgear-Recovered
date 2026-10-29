            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.util.LinkedHashSet;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class m40 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13558a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ b50 f13559b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ m40(b50 b50Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f13558a = i;
/* 3 */             this.f13559b = b50Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws IOException {
                    switch (this.f13558a) {
                        case 0:
/* 107 */                   return ((th0) this.f13559b.f2225j.getValue()).f17102b;
                        default:
/* 8 */                     qh0 qh0Var = this.f13559b.f2216a;
/* 20 */                    File canonicalFile = ((File) qh0Var.f15547b.invoke()).getCanonicalFile();
                            synchronized (qh0.f15545d) {
/* 27 */                        String absolutePath = canonicalFile.getAbsolutePath();
/* 31 */                        LinkedHashSet linkedHashSet = qh0.f15544c;
/* 37 */                        if (linkedHashSet.contains(absolutePath)) {
/* 94 */                            throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                                }
/* 39 */                        absolutePath.getClass();
/* 42 */                        linkedHashSet.add(absolutePath);
                            }
/* 62 */                    return new th0(canonicalFile, (qe2) qh0Var.f15546a.invoke(canonicalFile), new C0207c8(canonicalFile, 1));
                    }
                }
            }
