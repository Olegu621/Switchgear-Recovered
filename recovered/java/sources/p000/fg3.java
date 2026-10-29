            package p000;

            import com.google.android.gms.internal.playcore_age_signals.zzd;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fg3 extends IAgeSignalsServiceCallback.Stub {

                /* JADX INFO: renamed from: a */
                public final zzd f8206a;

                /* JADX INFO: renamed from: b */
                public final TaskCompletionSource f8207b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ xg3 f8208c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public fg3(xg3 xg3Var, TaskCompletionSource taskCompletionSource) {
/* 8 */             super("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
/* 1 */             Objects.requireNonNull(xg3Var);
/* 4 */             this.f8208c = xg3Var;
/* 18 */            this.f8206a = new zzd("OnCheckAgeSignalsCallback");
/* 20 */            this.f8207b = taskCompletionSource;
                }
            }
