            package p000;

            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.internal.IAccountAccessor;
            import java.util.Set;
            
            /* JADX INFO: renamed from: d9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface InterfaceC0836d9 extends InterfaceC2359x8 {
                void connect(InterfaceC0881ei interfaceC0881ei);

                void disconnect();

                void disconnect(String str);

                Feature[] getAvailableFeatures();

                String getEndpointPackageName();

                String getLastDisconnectMessage();

                int getMinApkVersion();

                void getRemoteService(IAccountAccessor iAccountAccessor, Set set);

                Set getScopesForConnectionlessNonSignIn();

                boolean isConnected();

                boolean isConnecting();

                void onUserSignOut(InterfaceC0918fi interfaceC0918fi);

                boolean requiresGooglePlayServices();

                boolean requiresSignIn();
            }
