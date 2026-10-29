            package org.chromium.support_lib_boundary;

            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public interface ServiceWorkerWebSettingsBoundaryInterface {
                boolean getAllowContentAccess();

                boolean getAllowFileAccess();

                boolean getBlockNetworkLoads();

                int getCacheMode();

                Set<String> getRequestedWithHeaderOriginAllowList();

                void setAllowContentAccess(boolean z);

                void setAllowFileAccess(boolean z);

                void setBlockNetworkLoads(boolean z);

                void setCacheMode(int i);

                void setRequestedWithHeaderOriginAllowList(Set<String> set);
            }
