            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.Unit;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class rg2 extends AbstractC1947n0 implements fk0, wo0, pg2, hk0 {

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f16047e = AtomicReferenceFieldUpdater.newUpdater(rg2.class, Object.class, "_state$volatile");

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ long f16048f = AbstractC1703b.f11726a.objectFieldOffset(rg2.class.getDeclaredField("_state$volatile"));
                private volatile /* synthetic */ Object _state$volatile;

                /* JADX INFO: renamed from: d */
                public int f16049d;

                public rg2(Object obj) {
/* 4 */             this._state$volatile = obj;
                }

                /* JADX INFO: renamed from: a */
                public final Object m8157a() {
/* 1 */             C2131r4 c2131r4 = jb1.f12171c;
/* 5 */             f16047e.getClass();
/* 12 */            Object objectVolatile = AbstractC1703b.f11726a.getObjectVolatile(this, f16048f);
/* 16 */            if (objectVolatile == c2131r4) {
/* 18 */                return null;
                    }
/* 19 */            return objectVolatile;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m8158b(Object obj, Object obj2) {
                    int i;
                    sg2[] sg2VarArr;
                    C2131r4 c2131r4;
                    synchronized (this) {
/* 2 */                 AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16047e;
/* 4 */                 Object obj3 = atomicReferenceFieldUpdater.get(this);
/* 9 */                 if (obj != null && !Intrinsics.m6216a(obj3, obj)) {
/* 8 */                     return false;
                        }
/* 27 */                if (Intrinsics.m6216a(obj3, obj2)) {
/* 26 */                    return true;
                        }
/* 31 */                atomicReferenceFieldUpdater.set(this, obj2);
/* 34 */                int i2 = this.f16049d;
/* 38 */                if ((i2 & 1) != 0) {
/* 137 */                   this.f16049d = i2 + 2;
/* 26 */                    return true;
                        }
/* 40 */                int i3 = i2 + 1;
/* 41 */                this.f16049d = i3;
/* 43 */                sg2[] sg2VarArr2 = this.f14083a;
                        while (true) {
/* 46 */                    if (sg2VarArr2 != null) {
/* 50 */                        for (sg2 sg2Var : sg2VarArr2) {
/* 54 */                            if (sg2Var != null) {
/* 56 */                                AtomicReference atomicReference = sg2Var.f16609a;
                                        while (true) {
/* 58 */                                    Object obj4 = atomicReference.get();
/* 62 */                                    if (obj4 == null || obj4 == (c2131r4 = b40.f2203d)) {
                                                break;
                                            }
/* 70 */                                    C2131r4 c2131r5 = b40.f2202c;
/* 72 */                                    if (obj4 != c2131r5) {
/* 108 */                                       do {
/* 92 */                                            if (atomicReference.compareAndSet(obj4, c2131r5)) {
/* 96 */                                                m42 m42Var = o42.f14612b;
/* 100 */                                               ((C0890er) obj4).resumeWith(Unit.f12910a);
                                                        break;
                                                    }
/* 108 */                                       } while (atomicReference.get() == obj4);
                                            } else {
/* 85 */                                        do {
/* 78 */                                            if (atomicReference.compareAndSet(obj4, c2131r4)) {
                                                        break;
                                                    }
/* 85 */                                        } while (atomicReference.get() == obj4);
                                            }
                                        }
                                    }
                                }
                            }
                            synchronized (this) {
/* 115 */                       i = this.f16049d;
/* 117 */                       if (i == i3) {
/* 120 */                           this.f16049d = i3 + 1;
/* 26 */                            return true;
                                }
/* 126 */                       sg2VarArr = this.f14083a;
                            }
/* 130 */                   sg2VarArr2 = sg2VarArr;
/* 131 */                   i3 = i;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:110:0x012b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:111:? A[LOOP:0: B:75:0x011e->B:111:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:78:0x0125 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:53:0x00bd, B:55:0x00c5, B:58:0x00cc, B:59:0x00d0, B:61:0x00d3, B:71:0x00f4, B:74:0x0104, B:75:0x011e, B:81:0x0132, B:84:0x013b, B:78:0x0125, B:80:0x012b, B:63:0x00d9, B:67:0x00e0, B:21:0x004d), top: B:100:0x0023 }] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [int] */
                /* JADX WARN: Type inference failed for: r2v1 */
                /* JADX WARN: Type inference failed for: r2v12 */
                /* JADX WARN: Type inference failed for: r2v14 */
                /* JADX WARN: Type inference failed for: r2v15 */
                /* JADX WARN: Type inference failed for: r2v16, types: [sg2] */
                /* JADX WARN: Type inference failed for: r2v17, types: [sg2] */
                /* JADX WARN: Type inference failed for: r2v18, types: [sg2] */
                /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, sg2] */
                /* JADX WARN: Type inference failed for: r2v20, types: [sg2] */
                /* JADX WARN: Type inference failed for: r2v21 */
                /* JADX WARN: Type inference failed for: r2v22 */
                /* JADX WARN: Type inference failed for: r2v23 */
                /* JADX WARN: Type inference failed for: r2v24 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0103 -> B:53:0x00bd). Please report as a decompilation issue!!! */
                /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
                    java.lang.StackOverflowError
                    	at java.base/java.util.HashMap.hash(Unknown Source)
                    	at java.base/java.util.HashMap.put(Unknown Source)
                    	at java.base/java.util.HashSet.add(Unknown Source)
                    	at jadx.core.utils.BlockUtils.addPredecessors(BlockUtils.java:703)
                    	at jadx.core.utils.BlockUtils.addPredecessors(BlockUtils.java:706)
                    */
                @Override // p000.fk0
                public final java.lang.Object collect(p000.hk0 r14, p000.c10 r15) {
                    /*
                        Method dump skipped, instruction units count: 348
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.rg2.collect(hk0, c10):java.lang.Object");
                }

                @Override // p000.hk0
                public final Object emit(Object obj, c10 c10Var) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = jb1.f12171c;
                    }
/* 6 */             m8158b(null, obj);
/* 9 */             return Unit.f12910a;
                }
            }
