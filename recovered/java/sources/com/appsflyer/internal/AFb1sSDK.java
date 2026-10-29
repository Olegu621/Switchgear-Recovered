            package com.appsflyer.internal;

            import android.media.AudioTrack;
            import android.telephony.cdma.CdmaCellLocation;
            import android.text.AndroidCharacter;
            import android.view.KeyEvent;
            import android.view.ViewConfiguration;
            import androidx.core.app.NotificationCompat;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Method;
            import java.util.Map;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, m6176d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFh1mSDK;", NotificationCompat.CATEGORY_EVENT, HttpUrl.FRAGMENT_ENCODE_SET, "rawData", "<init>", "(Lcom/appsflyer/internal/AFh1mSDK;[B)V", HttpUrl.FRAGMENT_ENCODE_SET, "afInfoLog", "()V", "AFAdRevenueData", "Lcom/appsflyer/internal/AFh1mSDK;", "getCurrencyIso4217Code", "getRevenue", "[B"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class AFb1sSDK {

                /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
                private final AFh1mSDK getCurrencyIso4217Code;
                private final byte[] getRevenue;

                public AFb1sSDK(AFh1mSDK aFh1mSDK, byte[] bArr) {
/* 1 */             aFh1mSDK.getClass();
/* 7 */             this.getCurrencyIso4217Code = aFh1mSDK;
/* 9 */             this.getRevenue = bArr;
                }

                public final void afInfoLog() {
                    try {
/* 15 */                Map map = AFa1hSDK.f3072d;
/* 17 */                Object declaredConstructor = map.get(-1994295490);
/* 26 */                if (declaredConstructor == null) {
/* 63 */                    declaredConstructor = ((Class) AFa1hSDK.getRevenue((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 88, (char) (58271 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getDeclaredConstructor(null);
/* 67 */                    map.put(-1994295490, declaredConstructor);
                        }
/* 72 */                Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
/* 81 */                Object[] objArr = {this.getCurrencyIso4217Code, this.getRevenue};
/* 88 */                Object method = map.get(2113693083);
/* 92 */                if (method == null) {
/* 135 */                   method = ((Class) AFa1hSDK.getRevenue(136 - AndroidCharacter.getMirror('0'), (char) (58271 - (ViewConfiguration.getPressedStateDuration() >> 16)), 37 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("getMonetizationNetwork", AFh1mSDK.class, byte[].class);
/* 139 */                   map.put(2113693083, method);
                        }
/* 144 */               ((Method) method).invoke(objNewInstance, objArr);
                    } catch (Throwable th) {
/* 149 */               Throwable cause = th.getCause();
/* 153 */               if (cause == null) {
/* 156 */                   throw th;
                        }
/* 155 */               throw cause;
                    }
                }
            }
