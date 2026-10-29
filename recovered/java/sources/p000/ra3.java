            package p000;

            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public abstract class ra3 implements Runnable {

                /* JADX INFO: renamed from: a */
                private final TaskCompletionSource f15959a;

                public ra3() {
/* 5 */             this.f15959a = null;
                }

                /* JADX INFO: renamed from: a */
                public void mo2452a(Exception exc) {
/* 1 */             TaskCompletionSource taskCompletionSource = this.f15959a;
/* 3 */             if (taskCompletionSource != null) {
/* 5 */                 taskCompletionSource.trySetException(exc);
                    }
                }

                /* JADX INFO: renamed from: b */
                public abstract void mo2453b();

                /* JADX INFO: renamed from: c */
                public final TaskCompletionSource m8121c() {
/* 1 */             return this.f15959a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
/* 1 */                 mo2453b();
                    } catch (Exception e) {
/* 6 */                 mo2452a(e);
                    }
                }

/* 7 */         public ra3(TaskCompletionSource taskCompletionSource) {
                    this.f15959a = taskCompletionSource;
                }
            }
