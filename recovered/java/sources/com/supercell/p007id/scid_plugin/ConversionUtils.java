            package com.supercell.p007id.scid_plugin;

            import java.nio.ByteBuffer;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import p000.lw0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/ConversionUtils;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Companion", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 2 */     public final class ConversionUtils {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/ConversionUtils$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Ljava/nio/ByteBuffer;", "buffer", HttpUrl.FRAGMENT_ENCODE_SET, "rowStride", "pixelStride", "width", "height", HttpUrl.FRAGMENT_ENCODE_SET, "out", "offset", "outputPixelStride", HttpUrl.FRAGMENT_ENCODE_SET, "unpackPlane", "(Ljava/nio/ByteBuffer;IIII[BII)V", HttpUrl.FRAGMENT_ENCODE_SET, "Llw0;", "planes", "YUV_420_888toNV21", "([Llw0;II)[B", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    private final void unpackPlane(ByteBuffer buffer, int rowStride, int pixelStride, int width, int height, byte[] out, int offset, int outputPixelStride) {
/* 1 */                 byte[] bArr = new byte[rowStride];
/* 5 */                 for (int i = 0; i < height; i++) {
/* 9 */                     buffer.position(i * rowStride);
/* 12 */                    buffer.get(bArr, 0, rowStride);
/* 16 */                    int i2 = 0;
/* 17 */                    for (int i3 = 0; i3 < width; i3++) {
/* 21 */                        out[offset] = bArr[i2];
/* 23 */                        offset += outputPixelStride;
/* 24 */                        i2 += pixelStride;
                            }
                        }
                    }

                    public final byte[] YUV_420_888toNV21(lw0[] planes, int width, int height) {
                        int i;
                        int i2;
/* 5 */                 planes.getClass();
/* 8 */                 int i3 = width * height;
/* 15 */                byte[] bArr = new byte[((i3 / 4) * 2) + i3];
/* 20 */                ByteBuffer buffer = planes[0].getBuffer();
/* 24 */                buffer.getClass();
/* 30 */                ByteBuffer buffer2 = planes[1].getBuffer();
/* 34 */                buffer2.getClass();
/* 39 */                ByteBuffer buffer3 = planes[2].getBuffer();
/* 43 */                buffer3.getClass();
/* 48 */                int iMo3991b = planes[0].mo3991b();
/* 54 */                int iMo3991b2 = planes[1].mo3991b();
/* 60 */                int iMo3997j = planes[1].mo3997j();
/* 64 */                if (iMo3991b == width) {
/* 66 */                    buffer.get(bArr, 0, i3);
/* 69 */                    i = i3;
                        } else {
/* 72 */                    int i4 = 0;
/* 73 */                    i = 0;
/* 74 */                    for (int i5 = 0; i5 < height; i5++) {
/* 76 */                        buffer.position(i4);
/* 79 */                        buffer.get(bArr, i, width);
/* 82 */                        i += width;
/* 83 */                        i4 += iMo3991b;
                            }
                        }
/* 87 */                int i6 = height / 2;
/* 89 */                int i7 = width / 2;
/* 91 */                if (iMo3997j != 2 || buffer2.remaining() < (i2 = i7 * i6) || buffer3.remaining() < i2) {
/* 148 */                   unpackPlane(buffer2, iMo3991b2, iMo3997j, i7, i6, bArr, i3 + 1, 2);
/* 159 */                   unpackPlane(buffer3, iMo3991b2, iMo3997j, i7, i6, bArr, i3, 2);
/* 162 */                   return bArr;
                        }
/* 108 */               for (int i8 = 0; i8 < i6; i8++) {
/* 110 */                   int i9 = i8 * iMo3991b2;
/* 113 */                   for (int i10 = 0; i10 < i7; i10++) {
/* 117 */                       int i11 = (i10 * iMo3997j) + i9;
/* 118 */                       int i12 = i + 1;
/* 124 */                       bArr[i] = buffer3.get(i11);
/* 126 */                       i += 2;
/* 132 */                       bArr[i12] = buffer2.get(i11);
                            }
                        }
/* 140 */               return bArr;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
