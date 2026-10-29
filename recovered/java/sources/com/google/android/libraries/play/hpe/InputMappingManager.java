            package com.google.android.libraries.play.hpe;

            import android.content.Context;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class InputMappingManager {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface MappingProvider {
                    byte[] getInputMap();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface RemappingListener {
                    void onInputMapRemapped(byte[] bArr);
                }

                public InputMappingManager(Context context) {
/* 11 */            throw new RuntimeException("Stub!");
                }

                public void register(MappingProvider mappingProvider) {
/* 2 */             throw null;
                }

                public void registerRemappingListener(RemappingListener remappingListener) {
/* 2 */             throw null;
                }

                public void setInputContext(byte[] bArr) {
/* 2 */             throw null;
                }

                public void unregister(MappingProvider mappingProvider) {
/* 2 */             throw null;
                }

                public void unregisterRemappingListener(RemappingListener remappingListener) {
/* 2 */             throw null;
                }
            }
