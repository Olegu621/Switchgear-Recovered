            package p000;

            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zv1 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f20352a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ac1 f20353b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Map.Entry f20354c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Map.Entry f20355d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ zv1(ac1 ac1Var, Map.Entry entry, Map.Entry entry2, int i) {
/* 10 */            super(1);
/* 1 */             this.f20352a = i;
/* 3 */             this.f20353b = ac1Var;
/* 5 */             this.f20354c = entry;
/* 7 */             this.f20355d = entry2;
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0063  */
                /* JADX WARN: Code duplicated, block: B:21:0x006a  */
                /* JADX WARN: Code duplicated, block: B:23:0x006d  */
                /* JADX WARN: Code duplicated, block: B:25:0x007f  */
                /* JADX WARN: Code duplicated, block: B:28:0x0087  */
                /* JADX WARN: Code duplicated, block: B:31:0x0091  */
                /* JADX WARN: Code duplicated, block: B:52:0x00da A[LOOP:3: B:50:0x00d4->B:52:0x00da, LOOP_END] */
                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v8 java.lang.Object, still in use, count: 2, list:
                      (r4v8 java.lang.Object) from 0x005f: PHI (r4 I:??) = (r4v5 java.lang.Object), (r4v8 java.lang.Object) binds: [B:17:0x005e, B:71:0x005f] A[DONT_GENERATE, DONT_INLINE]
                      (r4v8 java.lang.Object) from 0x004f: CHECK_CAST (java.util.Map$Entry) (r4v8 java.lang.Object)
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
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object r7) {
                    /*
                        Method dump skipped, instruction units count: 320
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.zv1.invoke(java.lang.Object):java.lang.Object");
                }
            }
