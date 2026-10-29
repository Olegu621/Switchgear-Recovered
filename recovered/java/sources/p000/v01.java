            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class v01 extends j42 implements Function2 {

                /* JADX INFO: renamed from: a */
                public qn1 f17819a;

                /* JADX INFO: renamed from: b */
                public C0156au f17820b;

                /* JADX INFO: renamed from: c */
                public int f17821c;

                /* JADX INFO: renamed from: d */
                public /* synthetic */ Object f17822d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ z01 f17823e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public v01(c10 c10Var, z01 z01Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.f17823e = z01Var;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             v01 v01Var = new v01(c10Var, this.f17823e);
/* 8 */             v01Var.f17822d = obj;
/* 10 */            return v01Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((v01) create((r92) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:21:0x005d  */
                /* JADX WARN: Code duplicated, block: B:23:0x0061  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:25:0x0073). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // p000.AbstractC0181bi
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        z10 r0 = p000.z10.f19902a
                        int r1 = r5.f17821c
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L23
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L18
                        au r1 = r5.f17820b
                        qn1 r3 = r5.f17819a
                        java.lang.Object r4 = r5.f17822d
                        r92 r4 = (p000.r92) r4
                        p000.pg3.m7417A(r6)
                        goto L73
                    L18:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        p000.f42.m3656l(r5)
                        r5 = 0
                        return r5
                    L1f:
                        p000.pg3.m7417A(r6)
                        goto L78
                    L23:
                        p000.pg3.m7417A(r6)
                        java.lang.Object r6 = r5.f17822d
                        r92 r6 = (p000.r92) r6
                        z01 r1 = r5.f17823e
                        java.lang.Object r1 = r1.m10260x()
                        boolean r4 = r1 instanceof p000.C0156au
                        if (r4 == 0) goto L3e
                        au r1 = (p000.C0156au) r1
                        cu r1 = r1.f2092v
                        r5.f17821c = r3
                        r6.mo7741a(r1, r5)
                        return r0
                    L3e:
                        boolean r3 = r1 instanceof p000.ix0
                        if (r3 == 0) goto L78
                        ix0 r1 = (p000.ix0) r1
                        qn1 r1 = r1.mo4393c()
                        if (r1 == 0) goto L78
                        java.lang.Object r3 = r1.m8454h()
                        r3.getClass()
                        s91 r3 = (p000.s91) r3
                        r4 = r3
                        r3 = r1
                        r1 = r4
                        r4 = r6
                    L57:
                        boolean r6 = r1.equals(r3)
                        if (r6 != 0) goto L78
                        boolean r6 = r1 instanceof p000.C0156au
                        if (r6 == 0) goto L73
                        au r1 = (p000.C0156au) r1
                        cu r6 = r1.f2092v
                        r5.f17822d = r4
                        r5.f17819a = r3
                        r5.f17820b = r1
                        r5.f17821c = r2
                        r4.mo7741a(r6, r5)
                        z10 r5 = p000.z10.f19902a
                        return r0
                    L73:
                        s91 r1 = r1.m8455i()
                        goto L57
                    L78:
                        kotlin.Unit r5 = kotlin.Unit.f12910a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.v01.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }
