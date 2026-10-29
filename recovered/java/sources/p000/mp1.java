            package p000;

            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mp1 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13898a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ sp1 f13899b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ mp1(sp1 sp1Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f13898a = i;
/* 3 */             this.f13899b = sp1Var;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 java.lang.Object, still in use, count: 2, list:
                      (r2v4 java.lang.Object) from 0x0031: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v4 java.lang.Object) binds: [B:14:0x0030, B:24:0x0031] A[DONT_GENERATE, DONT_INLINE]
                      (r2v4 java.lang.Object) from 0x0027: CHECK_CAST (kp1) (r2v4 java.lang.Object)
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                    	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                    	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                    	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                    	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                    */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    /*
                        r4 = this;
                        int r0 = r4.f13898a
                        sp1 r4 = r4.f13899b
                        switch(r0) {
                            case 0: goto L3e;
                            case 1: goto Ld;
                            default: goto L7;
                        }
                    L7:
                        r4.m8602b()
                        kotlin.Unit r4 = kotlin.Unit.f12910a
                        return r4
                    Ld:
                        kp1 r0 = r4.f16740c
                        r1 = 0
                        if (r0 != 0) goto L34
                        dd r0 = r4.f16739b
                        int r2 = r0.mo0a()
                        java.util.ListIterator r0 = r0.listIterator(r2)
                    L1c:
                        boolean r2 = r0.hasPrevious()
                        if (r2 == 0) goto L30
                        java.lang.Object r2 = r0.previous()
                        r3 = r2
                        kp1 r3 = (p000.kp1) r3
                        boolean r3 = r3.isEnabled()
                        if (r3 == 0) goto L1c
                        goto L31
                    L30:
                        r2 = r1
                    L31:
                        r0 = r2
                        kp1 r0 = (p000.kp1) r0
                    L34:
                        r4.f16740c = r1
                        if (r0 == 0) goto L3b
                        r0.handleOnBackCancelled()
                    L3b:
                        kotlin.Unit r4 = kotlin.Unit.f12910a
                        return r4
                    L3e:
                        r4.m8602b()
                        kotlin.Unit r4 = kotlin.Unit.f12910a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.mp1.invoke():java.lang.Object");
                }
            }
