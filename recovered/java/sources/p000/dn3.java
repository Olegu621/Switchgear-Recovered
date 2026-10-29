            package p000;

            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public abstract class dn3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final TaskCompletionSource f7351a;

                public dn3() {
/* 5 */             this.f7351a = null;
                }

                /* JADX INFO: renamed from: a */
                public abstract void mo3165a();

                @Override // java.lang.Runnable
                public final void run() {
                    try {
/* 1 */                 mo3165a();
                    } catch (Exception e) {
/* 6 */                 TaskCompletionSource taskCompletionSource = this.f7351a;
/* 8 */                 if (taskCompletionSource != null) {
/* 10 */                    taskCompletionSource.trySetException(e);
                        }
                    }
                }

/* 7 */         public dn3(TaskCompletionSource taskCompletionSource) {
                    this.f7351a = taskCompletionSource;
                }
            }
