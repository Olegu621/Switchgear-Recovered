            package com.supercell.p007id.scid_plugin.mobile_scanner.objects;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;", HttpUrl.FRAGMENT_ENCODE_SET, "width", HttpUrl.FRAGMENT_ENCODE_SET, "height", "rotation", HttpUrl.FRAGMENT_ENCODE_SET, "id", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "(DDIJ)V", "getWidth", "()D", "getHeight", "getRotation", "()I", "getId", "()J", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 14 */    public final class MobileScannerStartParameters {
                private final double height;
                private final long id;
                private final int rotation;
                private final double width;

                public /* synthetic */ MobileScannerStartParameters(double d, double d2, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 12 */            this((i2 & 1) != 0 ? 0.0d : d, d2, i, j);
                }

                public final double getHeight() {
/* 1 */             return this.height;
                }

                public final long getId() {
/* 1 */             return this.id;
                }

                public final int getRotation() {
/* 1 */             return this.rotation;
                }

                public final double getWidth() {
/* 1 */             return this.width;
                }

/* 15 */        public MobileScannerStartParameters(double d, double d2, int i, long j) {
/* 17 */            this.width = d;
/* 18 */            this.height = d2;
/* 19 */            this.rotation = i;
/* 20 */            this.id = j;
                }
            }
