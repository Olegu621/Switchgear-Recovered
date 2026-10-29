            package p000;

            import java.io.File;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: renamed from: c8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0207c8 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2757a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ File f2758b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C0207c8(File file, int i) {
/* 6 */             super(0);
/* 1 */             this.f2757a = i;
/* 3 */             this.f2758b = file;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (this.f2757a) {
                        case 0:
/* 33 */                    File file = new File(this.f2758b, "usercentrics");
/* 36 */                    file.mkdirs();
/* 39 */                    return file;
                        default:
/* 6 */                     Object obj = qh0.f15545d;
/* 8 */                     File file2 = this.f2758b;
                            synchronized (obj) {
/* 17 */                        qh0.f15544c.remove(file2.getAbsolutePath());
                            }
/* 21 */                    return Unit.f12910a;
                    }
                }
            }
