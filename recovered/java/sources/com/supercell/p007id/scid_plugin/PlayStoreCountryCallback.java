            package com.supercell.p007id.scid_plugin;

            import com.appsflyer.AdRevenueScheme;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;", HttpUrl.FRAGMENT_ENCODE_SET, "onCountryRetrieved", HttpUrl.FRAGMENT_ENCODE_SET, AdRevenueScheme.COUNTRY, HttpUrl.FRAGMENT_ENCODE_SET, "onError", "errorMessage", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public interface PlayStoreCountryCallback {
                void onCountryRetrieved(String country);

                void onError(String errorMessage);
            }
