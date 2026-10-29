            package com.google.android.play.core.integrity;

            import android.content.Context;
            import p000.C0828d1;
            import p000.C1951n4;
            import p000.ja3;
            import p000.la3;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.s */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0455s {

                /* JADX INFO: renamed from: a */
                private final la3 f5260a;

                /* JADX INFO: renamed from: b */
                private final la3 f5261b;

                /* JADX INFO: renamed from: c */
                private final la3 f5262c;

                /* JADX INFO: renamed from: d */
                private final la3 f5263d;

                /* JADX INFO: renamed from: e */
                private final la3 f5264e;

                public C0455s(Context context, C0454r c0454r) {
/* 6 */             if (context == null) {
/* 63 */                C1951n4.m6868s("instance cannot be null");
/* 67 */                throw null;
                    }
/* 8 */             C0828d1 c0828d1 = new C0828d1(context);
/* 11 */            this.f5260a = c0828d1;
/* 17 */            ja3 ja3VarM5733b = ja3.m5733b(C0390ac.f5151a);
/* 21 */            this.f5261b = ja3VarM5733b;
/* 29 */            C0408au c0408au = new C0408au(c0828d1, C0446l.f5253a);
/* 32 */            this.f5262c = c0408au;
/* 43 */            ja3 ja3VarM5733b2 = ja3.m5733b(new C0399al(c0828d1, ja3VarM5733b, c0408au, C0446l.f5253a));
/* 47 */            this.f5263d = ja3VarM5733b2;
/* 58 */            this.f5264e = ja3.m5733b(new C0389ab(ja3VarM5733b2));
                }

                /* JADX INFO: renamed from: a */
                public final IntegrityManager m2501a() {
/* 7 */             return (IntegrityManager) this.f5264e.mo2449a();
                }
            }
