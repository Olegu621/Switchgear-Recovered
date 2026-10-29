            package p000;

            import android.os.DeadObjectException;
            import android.os.RemoteException;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class wb3 extends gb3 {

                /* JADX INFO: renamed from: b */
                public final TaskCompletionSource f18571b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f18572c;

                /* JADX INFO: renamed from: d */
                public final Object f18573d;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public wb3(t81 t81Var, TaskCompletionSource taskCompletionSource) {
/* 5 */             this(4, taskCompletionSource);
/* 2 */             this.f18572c = 1;
/* 8 */             this.f18573d = t81Var;
                }

                /* JADX INFO: renamed from: i */
                private final /* bridge */ /* synthetic */ void m9520i(we2 we2Var, boolean z) {
                }

                /* JADX INFO: renamed from: j */
                private final /* bridge */ /* synthetic */ void m9521j(we2 we2Var, boolean z) {
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: a */
                public final void mo1333a(Status status) {
/* 8 */             this.f18571b.trySetException(new C1020i9(status));
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: b */
                public final void mo1334b(Exception exc) {
/* 3 */             this.f18571b.trySetException(exc);
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: c */
                public final void mo1335c(cb3 cb3Var) throws DeadObjectException {
                    try {
/* 1 */                 m9522h(cb3Var);
                    } catch (DeadObjectException e) {
/* 26 */                mo1333a(bc3.m1332e(e));
/* 29 */                throw e;
                    } catch (RemoteException e2) {
/* 17 */                mo1333a(bc3.m1332e(e2));
                    } catch (RuntimeException e3) {
/* 8 */                 this.f18571b.trySetException(e3);
                    }
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: d */
                public final /* bridge */ /* synthetic */ void mo1336d(we2 we2Var, boolean z) {
/* 1 */             int i = this.f18572c;
                }

                @Override // p000.gb3
                /* JADX INFO: renamed from: f */
                public final boolean mo3907f(cb3 cb3Var) {
/* 1 */             int i = this.f18572c;
/* 3 */             Object obj = this.f18573d;
                    switch (i) {
                        case 0:
/* 36 */                    return ((lb3) obj).f13173a.zab();
                        default:
/* 16 */                    lb3 lb3Var = (lb3) cb3Var.f2825f.get((t81) obj);
                            return lb3Var != null && lb3Var.f13173a.zab();
                    }
                }

                @Override // p000.gb3
                /* JADX INFO: renamed from: g */
                public final Feature[] mo3908g(cb3 cb3Var) {
/* 1 */             int i = this.f18572c;
/* 3 */             Object obj = this.f18573d;
                    switch (i) {
                        case 0:
/* 33 */                    return ((lb3) obj).f13173a.getRequiredFeatures();
                        default:
/* 16 */                    lb3 lb3Var = (lb3) cb3Var.f2825f.get((t81) obj);
/* 18 */                    if (lb3Var == null) {
/* 20 */                        return null;
                            }
/* 24 */                    return lb3Var.f13173a.getRequiredFeatures();
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m9522h(cb3 cb3Var) {
/* 1 */             int i = this.f18572c;
/* 3 */             Object obj = this.f18573d;
/* 5 */             TaskCompletionSource taskCompletionSource = this.f18571b;
                    switch (i) {
                        case 0:
/* 41 */                    lb3 lb3Var = (lb3) obj;
/* 43 */                    p22 p22Var = lb3Var.f13173a;
/* 47 */                    p22Var.registerListener(cb3Var.f2821b, taskCompletionSource);
/* 50 */                    t81 listenerKey = p22Var.getListenerKey();
/* 54 */                    if (listenerKey != null) {
/* 58 */                        cb3Var.f2825f.put(listenerKey, lb3Var);
                            }
                            break;
                        default:
/* 18 */                    lb3 lb3Var2 = (lb3) cb3Var.f2825f.remove((t81) obj);
/* 20 */                    if (lb3Var2 == null) {
/* 37 */                        taskCompletionSource.trySetResult(Boolean.FALSE);
                            } else {
/* 26 */                        lb3Var2.f13174b.unregisterListener(cb3Var.f2821b, taskCompletionSource);
/* 31 */                        lb3Var2.f13173a.clearListener();
                            }
                            break;
                    }
                }

/* 10 */        public wb3(int i, TaskCompletionSource taskCompletionSource) {
/* 11 */            super(i);
/* 12 */            this.f18571b = taskCompletionSource;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 12 */        public wb3(lb3 lb3Var, TaskCompletionSource taskCompletionSource) {
/* 13 */            this(3, taskCompletionSource);
                    this.f18572c = 0;
                    this.f18573d = lb3Var;
                }
            }
