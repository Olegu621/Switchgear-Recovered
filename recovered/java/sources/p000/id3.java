            package p000;

            import com.google.android.gms.common.ConnectionResult;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class id3 extends Exception {

                /* JADX INFO: renamed from: a */
                public final ConnectionResult f9556a;

                public id3(ConnectionResult connectionResult) {
/* 17 */            kb1.m6053f("ResolvableConnectionException can only be created with a connection result containing a resolution.", (connectionResult.f3416b == 0 || connectionResult.f3417c == null) ? false : true);
/* 20 */            this.f9556a = connectionResult;
                }
            }
