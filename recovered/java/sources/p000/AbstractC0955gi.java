            package p000;

            import android.os.DeadObjectException;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.api.internal.BasePendingResult;
            
            /* JADX INFO: renamed from: gi */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    public abstract class AbstractC0955gi extends BasePendingResult implements InterfaceC0992hi {
                private final C0983h9 api;
                private final AbstractC2489y8 clientKey;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AbstractC0955gi(C0983h9 c0983h9, tr0 tr0Var) {
/* 6 */             super(tr0Var);
/* 3 */             kb1.m6062o(tr0Var, "GoogleApiClient must not be null");
/* 11 */            kb1.m6062o(c0983h9, "Api must not be null");
/* 16 */            this.clientKey = c0983h9.f8967b;
/* 18 */            this.api = c0983h9;
                }

                public abstract void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException;

                public final C0983h9 getApi() {
/* 1 */             return this.api;
                }

                public final AbstractC2489y8 getClientKey() {
/* 1 */             return this.clientKey;
                }

                public void onSetFailedResult(p42 p42Var) {
                }

                public final void run(InterfaceC2359x8 interfaceC2359x8) throws DeadObjectException {
                    try {
/* 4 */                 doExecute(interfaceC2359x8);
                    } catch (DeadObjectException e) {
/* 32 */                setFailedResult(new Status(8, e.getLocalizedMessage(), null, null));
/* 35 */                throw e;
                    } catch (RemoteException e2) {
/* 18 */                setFailedResult(new Status(8, e2.getLocalizedMessage(), null, null));
                    }
                }

                public final void setFailedResult(Status status) {
/* 9 */             kb1.m6053f("Failed result must not be success", !status.m2006D1());
/* 12 */            p42 p42VarCreateFailedResult = createFailedResult(status);
/* 16 */            setResult(p42VarCreateFailedResult);
/* 19 */            onSetFailedResult(p42VarCreateFailedResult);
                }

                public /* bridge */ /* synthetic */ void setResult(Object obj) {
/* 3 */             setResult((p42) obj);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public AbstractC0955gi(tr0 tr0Var) {
                    super(tr0Var);
                    C0872e9 c0872e9 = ea0.f7592a;
/* 21 */            kb1.m6062o(tr0Var, "GoogleApiClient must not be null");
/* 22 */            this.clientKey = c0872e9;
                    this.api = null;
                }
            }
