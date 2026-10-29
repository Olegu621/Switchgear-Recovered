            package p000;

            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ta3 extends ra3 {

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ TaskCompletionSource f17010i;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ ra3 f17011v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ z93 f17012w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ta3(z93 z93Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, ra3 ra3Var) {
/* 7 */             super(taskCompletionSource);
/* 1 */             this.f17010i = taskCompletionSource2;
/* 3 */             this.f17011v = ra3Var;
/* 5 */             this.f17012w = z93Var;
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: b */
                public final void mo2453b() {
                    synchronized (this.f17012w.f20009f) {
                        try {
/* 6 */                     z93 z93Var = this.f17012w;
/* 8 */                     TaskCompletionSource taskCompletionSource = this.f17010i;
/* 12 */                    z93Var.f20008e.add(taskCompletionSource);
/* 27 */                    taskCompletionSource.getTask().addOnCompleteListener(new we2(z93Var, taskCompletionSource, 14, false));
/* 38 */                    if (this.f17012w.f20015l.getAndIncrement() > 0) {
/* 48 */                        this.f17012w.f20005b.m7756b("Already connected to the service.", new Object[0]);
                            }
/* 58 */                    z93.m10288b(this.f17012w, this.f17011v);
                        } catch (Throwable th) {
/* 64 */                    throw th;
                        }
                    }
                }
            }
