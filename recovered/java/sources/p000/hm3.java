            package p000;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class hm3 extends dn3 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f9147b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ TaskCompletionSource f9148c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f9149d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f9150e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public hm3(wq3 wq3Var, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
/* 10 */            super(taskCompletionSource);
/* 2 */             this.f9147b = 0;
/* 4 */             this.f9150e = wq3Var;
/* 6 */             this.f9149d = str;
/* 8 */             this.f9148c = taskCompletionSource2;
                }

                @Override // p000.dn3
                /* JADX INFO: renamed from: a */
                public final void mo3165a() {
                    switch (this.f9147b) {
                        case 0:
/* 139 */                   TaskCompletionSource taskCompletionSource = this.f9148c;
/* 143 */                   wq3 wq3Var = (wq3) this.f9150e;
/* 147 */                   String str = (String) this.f9149d;
                            try {
/* 164 */                       wq3Var.f18753a.f19798m.mo2441r(wq3Var.f18754b, wq3.m9603a(wq3Var, str), new gq3(wq3Var, taskCompletionSource, str));
/* 188 */                       return;
                            } catch (RemoteException e) {
/* 177 */                       wq3.f18751e.m1529b(e, "requestUpdateInfo(%s)", str);
/* 185 */                       taskCompletionSource.trySetException(new RuntimeException(e));
/* 188 */                       return;
                            }
                        case 1:
/* 82 */                    TaskCompletionSource taskCompletionSource2 = this.f9148c;
/* 86 */                    wq3 wq3Var2 = (wq3) this.f9150e;
                            try {
/* 110 */                       wq3Var2.f18753a.f19798m.mo2442w(wq3Var2.f18754b, wq3.m9604b(), new fp3(wq3Var2, new C0204c5("OnCompleteUpdateCallback"), taskCompletionSource2));
/* 138 */                       return;
                            } catch (RemoteException e2) {
/* 127 */                       wq3.f18751e.m1529b(e2, "completeUpdate(%s)", (String) this.f9149d);
/* 135 */                       taskCompletionSource2.trySetException(new RuntimeException(e2));
/* 138 */                       return;
                            }
                        default:
                            synchronized (((yr3) this.f9150e).f19791f) {
                                try {
/* 15 */                            yr3 yr3Var = (yr3) this.f9150e;
/* 17 */                            TaskCompletionSource taskCompletionSource3 = this.f9148c;
/* 21 */                            yr3Var.f19790e.add(taskCompletionSource3);
/* 36 */                            taskCompletionSource3.getTask().addOnCompleteListener(new we2(yr3Var, taskCompletionSource3, 23, false));
/* 49 */                            if (((yr3) this.f9150e).f19796k.getAndIncrement() > 0) {
/* 61 */                                ((yr3) this.f9150e).f19787b.m1530c("Already connected to the service.", new Object[0]);
                                    }
/* 75 */                            yr3.m10176b((yr3) this.f9150e, (dn3) this.f9149d);
                                } catch (Throwable th) {
/* 81 */                            throw th;
                                }
                                break;
                            }
/* 79 */                    return;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public /* synthetic */ hm3(Object obj, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Object obj2, int i) {
                    super(taskCompletionSource);
/* 14 */            this.f9147b = i;
                    this.f9150e = obj;
                    this.f9148c = taskCompletionSource2;
                    this.f9149d = obj2;
                }
            }
