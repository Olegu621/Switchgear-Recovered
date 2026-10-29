            package p000;
            
            /* JADX INFO: renamed from: rn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2150rn implements xo0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16190a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2154rr f16191b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C2467xn f16192c;

                public /* synthetic */ C2150rn(C2467xn c2467xn, C2154rr c2154rr, int i) {
/* 1 */             this.f16190a = i;
/* 3 */             this.f16192c = c2467xn;
/* 5 */             this.f16191b = c2154rr;
                }

                /* JADX INFO: renamed from: a */
                private final void m8207a(Throwable th) {
                }

                /* JADX WARN: Code duplicated, block: B:14:0x0035  */
                /* JADX WARN: Code duplicated, block: B:16:0x003f  */
                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v9 fb2, still in use, count: 2, list:
                      (r1v9 fb2) from 0x0027: INVOKE (r1v9 fb2) VIRTUAL call: fb2.b():java.util.List A[MD:():java.util.List (m), WRAPPED] (LINE:40)
                      (r1v9 fb2) from 0x0033: PHI (r1 I:??) = (r1v6 fb2), (r1v9 fb2) binds: [B:12:0x0032, B:28:0x0033] A[DONT_GENERATE, DONT_INLINE]
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
                @Override // p000.xo0
                public final void onFailure(java.lang.Throwable r5) {
                    /*
                        r4 = this;
                        int r0 = r4.f16190a
                        switch(r0) {
                            case 0: goto L8c;
                            default: goto L5;
                        }
                    L5:
                        boolean r0 = r5 instanceof p000.c70
                        xn r1 = r4.f16192c
                        r2 = 9
                        if (r0 == 0) goto L52
                        c70 r5 = (p000.c70) r5
                        d70 r5 = r5.f2753a
                        fs0 r0 = r1.f19259a
                        java.util.Collection r0 = r0.m3817n()
                        java.util.Iterator r0 = r0.iterator()
                    L1b:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L32
                        java.lang.Object r1 = r0.next()
                        fb2 r1 = (p000.fb2) r1
                        java.util.List r3 = r1.m3702b()
                        boolean r3 = r3.contains(r5)
                        if (r3 == 0) goto L1b
                        goto L33
                    L32:
                        r1 = 0
                    L33:
                        if (r1 == 0) goto L8c
                        xn r4 = r4.f16192c
                        nt0 r5 = p000.pg3.m7436o()
                        db2 r0 = r1.f8119f
                        if (r0 == 0) goto L8c
                        java.lang.Throwable r3 = new java.lang.Throwable
                        r3.<init>()
                        java.lang.String r3 = "Posting surface closed"
                        r4.m10000s(r3)
                        j8 r4 = new j8
                        r4.<init>(r2, r0, r1)
                        r5.execute(r4)
                        goto L8c
                    L52:
                        boolean r0 = r5 instanceof java.util.concurrent.CancellationException
                        if (r0 == 0) goto L5c
                        java.lang.String r4 = "Unable to configure camera cancelled"
                        r1.m10000s(r4)
                        goto L8c
                    L5c:
                        int r0 = r1.f19284s0
                        if (r0 != r2) goto L6c
                        xn r0 = r4.f16192c
                        ff r1 = new ff
                        r3 = 4
                        r1.<init>(r3, r5)
                        r3 = 1
                        r0.m9984D(r2, r1, r3)
                    L6c:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r1 = "Unable to configure camera "
                        r0.<init>(r1)
                        xn r1 = r4.f16192c
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        java.lang.String r1 = "Camera2CameraImpl"
                        p000.hu0.m4326U(r1, r0, r5)
                        xn r5 = r4.f16192c
                        rr r0 = r5.f19255W
                        rr r4 = r4.f16191b
                        if (r0 != r4) goto L8c
                        r5.m9983C()
                    L8c:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.C2150rn.onFailure(java.lang.Throwable):void");
                }

                @Override // p000.xo0
                public final void onSuccess(Object obj) {
                    switch (this.f16190a) {
                        case 0:
/* 39 */                    this.f16192c.f19256X.remove(this.f16191b);
/* 46 */                    int iM3520y = AbstractC0886en.m3520y(this.f16192c.f19284s0);
/* 51 */                    if (iM3520y != 1 && iM3520y != 4) {
/* 57 */                        if (iM3520y == 5 || (iM3520y == 6 && this.f16192c.f19254V != 0)) {
/* 74 */                            this.f16192c.m10000s("Camera reopen required. Checking if the current camera can be closed safely.");
                                }
                            }
/* 85 */                    if (this.f16192c.f19256X.isEmpty()) {
/* 87 */                        C2467xn c2467xn = this.f16192c;
/* 91 */                        if (c2467xn.f19253U != null) {
/* 95 */                            c2467xn.m10000s("closing camera");
/* 102 */                           this.f16192c.f19253U.close();
/* 108 */                           this.f16192c.f19253U = null;
                                }
                            }
                            break;
                        default:
/* 8 */                     C2467xn c2467xn2 = this.f16192c;
/* 15 */                    if (c2467xn2.f19260a0.f12882b == 2 && c2467xn2.f19284s0 == 9) {
/* 27 */                        this.f16192c.m9985E(10);
                                break;
                            }
                            break;
                    }
                }
            }
