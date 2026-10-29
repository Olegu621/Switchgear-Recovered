            package p000;

            import java.util.concurrent.CancellationException;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function1;
            import kotlin.sequences.Sequence;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public interface h01 extends CoroutineContext.Element {
                InterfaceC2563zt attachChild(InterfaceC0820cu interfaceC0820cu);

                void cancel(CancellationException cancellationException);

                CancellationException getCancellationException();

                Sequence getChildren();

                e90 invokeOnCompletion(Function1 function1);

                e90 invokeOnCompletion(boolean z, boolean z2, Function1 function1);

                boolean isActive();

                boolean isCancelled();

                boolean isCompleted();

                Object join(c10 c10Var);

                boolean start();
            }
