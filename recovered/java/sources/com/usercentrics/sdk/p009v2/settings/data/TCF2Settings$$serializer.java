            package com.usercentrics.sdk.p009v2.settings.data;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.List;
            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import okhttp3.internal.http2.Http2Connection;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import p000.C0920fk;
            import p000.C1951n4;
            import p000.InterfaceC1870ky;
            import p000.az0;
            import p000.de3;
            import p000.fj0;
            import p000.j13;
            import p000.pk2;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/TCF2Settings.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class TCF2Settings$$serializer implements uq0 {
                public static final TCF2Settings$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             TCF2Settings$$serializer tCF2Settings$$serializer = new TCF2Settings$$serializer();
/* 6 */             INSTANCE = tCF2Settings$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.TCF2Settings", tCF2Settings$$serializer, 63);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("firstLayerTitle", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("secondLayerTitle", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("tabsPurposeLabel", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("tabsVendorsLabel", false);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("labelsFeatures", false);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("labelsIabVendors", false);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("labelsNonIabPurposes", false);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("labelsNonIabVendors", false);
/* 60 */            pluginGeneratedSerialDescriptor.m6270j("labelsPurposes", false);
/* 65 */            pluginGeneratedSerialDescriptor.m6270j("vendorFeatures", false);
/* 70 */            pluginGeneratedSerialDescriptor.m6270j("vendorLegitimateInterestPurposes", false);
/* 75 */            pluginGeneratedSerialDescriptor.m6270j("vendorPurpose", false);
/* 80 */            pluginGeneratedSerialDescriptor.m6270j("vendorSpecialFeatures", false);
/* 85 */            pluginGeneratedSerialDescriptor.m6270j("vendorSpecialPurposes", false);
/* 90 */            pluginGeneratedSerialDescriptor.m6270j("togglesConsentToggleLabel", false);
/* 95 */            pluginGeneratedSerialDescriptor.m6270j("togglesLegIntToggleLabel", false);
/* 100 */           pluginGeneratedSerialDescriptor.m6270j("buttonsAcceptAllLabel", false);
/* 105 */           pluginGeneratedSerialDescriptor.m6270j("buttonsDenyAllLabel", false);
/* 110 */           pluginGeneratedSerialDescriptor.m6270j("buttonsSaveLabel", false);
/* 115 */           pluginGeneratedSerialDescriptor.m6270j("linksManageSettingsLabel", false);
/* 120 */           pluginGeneratedSerialDescriptor.m6270j("linksVendorListLinkLabel", false);
/* 125 */           pluginGeneratedSerialDescriptor.m6270j("togglesSpecialFeaturesToggleOn", false);
/* 130 */           pluginGeneratedSerialDescriptor.m6270j("togglesSpecialFeaturesToggleOff", false);
/* 136 */           pluginGeneratedSerialDescriptor.m6270j("firstLayerMobileVariant", true);
/* 141 */           pluginGeneratedSerialDescriptor.m6270j("firstLayerHideToggles", true);
/* 146 */           pluginGeneratedSerialDescriptor.m6270j("secondLayerHideToggles", true);
/* 151 */           pluginGeneratedSerialDescriptor.m6270j("hideLegitimateInterestToggles", true);
/* 156 */           pluginGeneratedSerialDescriptor.m6270j("categoriesOfDataLabel", true);
/* 161 */           pluginGeneratedSerialDescriptor.m6270j("dataRetentionPeriodLabel", true);
/* 166 */           pluginGeneratedSerialDescriptor.m6270j("legitimateInterestLabel", true);
/* 171 */           pluginGeneratedSerialDescriptor.m6270j("version", true);
/* 176 */           pluginGeneratedSerialDescriptor.m6270j("examplesLabel", true);
/* 181 */           pluginGeneratedSerialDescriptor.m6270j("cmpId", true);
/* 186 */           pluginGeneratedSerialDescriptor.m6270j("cmpVersion", true);
/* 191 */           pluginGeneratedSerialDescriptor.m6270j("showDataSharedOutsideEUText", true);
/* 196 */           pluginGeneratedSerialDescriptor.m6270j("dataSharedOutsideEUText", true);
/* 201 */           pluginGeneratedSerialDescriptor.m6270j("vendorIdsOutsideEUList", true);
/* 206 */           pluginGeneratedSerialDescriptor.m6270j("firstLayerHideButtonDeny", true);
/* 211 */           pluginGeneratedSerialDescriptor.m6270j("hideButtonManageSettings", true);
/* 216 */           pluginGeneratedSerialDescriptor.m6270j("secondLayerHideButtonDeny", true);
/* 221 */           pluginGeneratedSerialDescriptor.m6270j("publisherCountryCode", true);
/* 226 */           pluginGeneratedSerialDescriptor.m6270j("purposeOneTreatment", true);
/* 231 */           pluginGeneratedSerialDescriptor.m6270j("selectedVendorIds", true);
/* 236 */           pluginGeneratedSerialDescriptor.m6270j("gdprApplies", true);
/* 241 */           pluginGeneratedSerialDescriptor.m6270j("selectedStacks", true);
/* 246 */           pluginGeneratedSerialDescriptor.m6270j("scope", true);
/* 251 */           pluginGeneratedSerialDescriptor.m6270j("disabledSpecialFeatures", true);
/* 256 */           pluginGeneratedSerialDescriptor.m6270j("firstLayerShowDescriptions", true);
/* 261 */           pluginGeneratedSerialDescriptor.m6270j("hideNonIabOnFirstLayer", true);
/* 266 */           pluginGeneratedSerialDescriptor.m6270j("resurfacePeriodEnded", true);
/* 271 */           pluginGeneratedSerialDescriptor.m6270j("resurfacePurposeChanged", true);
/* 276 */           pluginGeneratedSerialDescriptor.m6270j("resurfaceVendorAdded", true);
/* 281 */           pluginGeneratedSerialDescriptor.m6270j("firstLayerDescription", true);
/* 286 */           pluginGeneratedSerialDescriptor.m6270j("firstLayerAdditionalInfo", true);
/* 291 */           pluginGeneratedSerialDescriptor.m6270j("secondLayerDescription", true);
/* 296 */           pluginGeneratedSerialDescriptor.m6270j("appLayerNoteResurface", true);
/* 301 */           pluginGeneratedSerialDescriptor.m6270j("firstLayerNoteResurface", true);
/* 306 */           pluginGeneratedSerialDescriptor.m6270j("changedPurposes", true);
/* 311 */           pluginGeneratedSerialDescriptor.m6270j("acmV2Enabled", true);
/* 316 */           pluginGeneratedSerialDescriptor.m6270j("selectedATPIds", true);
/* 321 */           pluginGeneratedSerialDescriptor.m6270j("resurfaceATPListChanged", true);
/* 326 */           pluginGeneratedSerialDescriptor.m6270j("atpListTitle", true);
/* 331 */           pluginGeneratedSerialDescriptor.m6270j("maintainLegitimateInterest", true);
/* 334 */           descriptor = pluginGeneratedSerialDescriptor;
                }

                private TCF2Settings$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = TCF2Settings.f6469l0;
/* 3 */             vh2 vh2Var = vh2.f18183a;
/* 9 */             KSerializer kSerializerM5647i = j13.m5647i(kSerializerArr[23]);
/* 13 */            C0920fk c0920fk = C0920fk.f8246a;
/* 15 */            KSerializer kSerializerM5647i2 = j13.m5647i(vh2Var);
/* 21 */            KSerializer kSerializer = kSerializerArr[36];
/* 23 */            KSerializer kSerializerM5647i3 = j13.m5647i(c0920fk);
/* 27 */            KSerializer kSerializerM5647i4 = j13.m5647i(c0920fk);
/* 33 */            KSerializer kSerializer2 = kSerializerArr[42];
/* 37 */            KSerializer kSerializer3 = kSerializerArr[44];
/* 41 */            KSerializer kSerializer4 = kSerializerArr[45];
/* 45 */            KSerializer kSerializer5 = kSerializerArr[46];
/* 47 */            KSerializer kSerializerM5647i5 = j13.m5647i(vh2Var);
/* 51 */            KSerializer kSerializerM5647i6 = j13.m5647i(vh2Var);
/* 55 */            KSerializer kSerializerM5647i7 = j13.m5647i(vh2Var);
/* 59 */            KSerializer kSerializerM5647i8 = j13.m5647i(vh2Var);
/* 63 */            KSerializer kSerializerM5647i9 = j13.m5647i(vh2Var);
/* 69 */            KSerializer kSerializerM5647i10 = j13.m5647i(TCF2ChangedPurposes$$serializer.INSTANCE);
/* 75 */            KSerializer kSerializer6 = kSerializerArr[59];
/* 209 */           az0 az0Var = az0.f2143a;
/* 81 */            return new KSerializer[]{vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, kSerializerM5647i, c0920fk, c0920fk, c0920fk, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, az0Var, az0Var, c0920fk, kSerializerM5647i2, kSerializer, kSerializerM5647i3, kSerializerM5647i4, c0920fk, vh2Var, c0920fk, kSerializer2, c0920fk, kSerializer3, kSerializer4, kSerializer5, c0920fk, c0920fk, c0920fk, c0920fk, c0920fk, kSerializerM5647i5, kSerializerM5647i6, kSerializerM5647i7, kSerializerM5647i8, kSerializerM5647i9, kSerializerM5647i10, c0920fk, kSerializer6, c0920fk, vh2Var, c0920fk};
                }

                @Override // kotlinx.serialization.KSerializer
                public TCF2Settings deserialize(Decoder decoder) {
                    int i;
                    int i2;
                    int i3;
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr = TCF2Settings.f6469l0;
/* 20 */            Boolean bool = null;
/* 21 */            Boolean bool2 = null;
/* 22 */            List list = null;
/* 23 */            TCF2ChangedPurposes tCF2ChangedPurposes = null;
/* 24 */            List list2 = null;
/* 25 */            String str = null;
/* 26 */            String str2 = null;
/* 27 */            int i4 = 0;
/* 28 */            List list3 = null;
/* 29 */            pk2 pk2Var = null;
/* 30 */            List list4 = null;
/* 31 */            String str3 = null;
/* 32 */            String str4 = null;
/* 33 */            String str5 = null;
/* 34 */            String strMo4376v = null;
/* 36 */            String strMo4376v2 = null;
/* 38 */            String strMo4376v3 = null;
/* 40 */            String strMo4376v4 = null;
/* 42 */            String strMo4376v5 = null;
/* 44 */            String strMo4376v6 = null;
/* 46 */            String strMo4376v7 = null;
/* 48 */            String strMo4376v8 = null;
/* 50 */            String strMo4376v9 = null;
/* 52 */            String strMo4376v10 = null;
/* 54 */            String strMo4376v11 = null;
/* 56 */            String strMo4376v12 = null;
/* 58 */            String strMo4376v13 = null;
/* 60 */            String strMo4376v14 = null;
/* 62 */            String strMo4376v15 = null;
/* 64 */            String strMo4376v16 = null;
/* 66 */            String strMo4376v17 = null;
/* 68 */            boolean zMo4374t = false;
/* 70 */            boolean zMo4374t2 = false;
/* 72 */            boolean zMo4374t3 = false;
/* 74 */            String strMo4376v18 = null;
/* 76 */            String strMo4376v19 = null;
/* 78 */            String strMo4376v20 = null;
/* 80 */            String strMo4376v21 = null;
/* 82 */            String strMo4376v22 = null;
/* 84 */            int iMo4371q = 0;
/* 86 */            int iMo4371q2 = 0;
/* 88 */            boolean zMo4374t4 = false;
/* 90 */            boolean z = true;
/* 92 */            String strMo4376v23 = null;
/* 94 */            String strMo4376v24 = null;
/* 96 */            boolean zMo4374t5 = false;
/* 98 */            String strMo4376v25 = null;
/* 100 */           boolean zMo4374t6 = false;
/* 102 */           String strMo4376v26 = null;
/* 104 */           boolean zMo4374t7 = false;
/* 106 */           String strMo4376v27 = null;
/* 108 */           String strMo4376v28 = null;
/* 110 */           String strMo4376v29 = null;
/* 112 */           boolean zMo4374t8 = false;
/* 114 */           boolean zMo4374t9 = false;
/* 116 */           boolean zMo4374t10 = false;
/* 118 */           boolean zMo4374t11 = false;
/* 120 */           boolean zMo4374t12 = false;
/* 122 */           int i5 = 0;
/* 124 */           fj0 fj0Var = null;
/* 126 */           String str6 = null;
/* 128 */           List list5 = null;
/* 130 */           boolean zMo4374t13 = false;
/* 132 */           boolean zMo4374t14 = false;
/* 134 */           String strMo4376v30 = null;
/* 136 */           boolean zMo4374t15 = false;
/* 138 */           while (z) {
/* 140 */               int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 1355 */                      bool2 = bool2;
/* 1364 */                      i = i5;
/* 1366 */                      z = false;
/* 1368 */                      bool = bool;
/* 1370 */                      list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 0:
/* 1346 */                      i2 = i5 | 1;
/* 1342 */                      strMo4376v23 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 0);
/* 1350 */                      list = list;
/* 1326 */                      i = i2;
/* 1328 */                      bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 1:
/* 1319 */                      i2 = i5 | 2;
/* 1315 */                      strMo4376v24 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 1);
/* 1323 */                      list = list;
/* 1326 */                      i = i2;
/* 1328 */                      bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 2:
/* 1281 */                      bool = bool;
/* 1283 */                      bool2 = bool2;
/* 1285 */                      list = list;
/* 1296 */                      i = i5 | 4;
/* 1292 */                      strMo4376v26 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 2);
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 3:
/* 1258 */                      bool = bool;
/* 1260 */                      bool2 = bool2;
/* 1262 */                      list = list;
/* 1273 */                      i = i5 | 8;
/* 1269 */                      strMo4376v27 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 3);
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 4:
/* 1235 */                      bool = bool;
/* 1237 */                      bool2 = bool2;
/* 1239 */                      list = list;
/* 1250 */                      i = i5 | 16;
/* 1246 */                      strMo4376v28 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 4);
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 5:
/* 1212 */                      bool = bool;
/* 1214 */                      bool2 = bool2;
/* 1216 */                      list = list;
/* 1227 */                      i = i5 | 32;
/* 1223 */                      strMo4376v29 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 5);
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 6:
/* 1204 */                      strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 6);
/* 1208 */                      i3 = i5 | 64;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 7:
/* 1185 */                      strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 7);
/* 1189 */                      i3 = i5 | 128;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 8:
/* 1166 */                      strMo4376v3 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 8);
/* 1170 */                      i3 = i5 | NotificationCompat.FLAG_LOCAL_ONLY;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 9:
/* 1146 */                      strMo4376v4 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 9);
/* 1150 */                      i3 = i5 | NotificationCompat.FLAG_GROUP_SUMMARY;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 10:
/* 1126 */                      strMo4376v5 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 10);
/* 1130 */                      i3 = i5 | Segment.SHARE_MINIMUM;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 11:
/* 1106 */                      strMo4376v6 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 11);
/* 1110 */                      i3 = i5 | 2048;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 12:
/* 1086 */                      strMo4376v7 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 12);
/* 1090 */                      i3 = i5 | 4096;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1066 */                      strMo4376v8 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 13);
/* 1070 */                      i3 = i5 | Segment.SIZE;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 14:
/* 1044 */                      strMo4376v9 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 14);
/* 1050 */                      i3 = i5 | Http2.INITIAL_MAX_FRAME_SIZE;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1026 */                      strMo4376v10 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 15);
/* 1030 */                      i3 = i5 | 32768;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 16:
/* 1008 */                      strMo4376v11 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 16);
/* 1012 */                      i3 = i5 | 65536;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 17:
/* 990 */                       strMo4376v12 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 17);
/* 994 */                       i3 = i5 | 131072;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 18:
/* 972 */                       strMo4376v13 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 18);
/* 976 */                       i3 = i5 | 262144;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 19:
/* 954 */                       strMo4376v14 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 19);
/* 958 */                       i3 = i5 | 524288;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 20:
/* 936 */                       strMo4376v15 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 20);
/* 940 */                       i3 = i5 | 1048576;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 918 */                       strMo4376v16 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 21);
/* 922 */                       i3 = i5 | 2097152;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 900 */                       strMo4376v17 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 22);
/* 904 */                       i3 = i5 | 4194304;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 862 */                       bool = bool;
/* 864 */                       bool2 = bool2;
/* 866 */                       list = list;
/* 880 */                       fj0Var = (fj0) interfaceC1870kyMo3297c.mo4377y(descriptor2, 23, kSerializerArr[23], fj0Var);
/* 882 */                       i = i5 | 8388608;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 24:
/* 855 */                       zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 24);
/* 859 */                       i3 = i5 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 838 */                       zMo4374t2 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 25);
/* 842 */                       i3 = i5 | 33554432;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 821 */                       zMo4374t3 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 26);
/* 825 */                       i3 = i5 | 67108864;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 804 */                       strMo4376v18 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 27);
/* 808 */                       i3 = i5 | 134217728;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 787 */                       strMo4376v19 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 28);
/* 791 */                       i3 = i5 | 268435456;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 770 */                       strMo4376v20 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 29);
/* 774 */                       i3 = i5 | 536870912;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 753 */                       strMo4376v21 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 30);
/* 757 */                       i3 = i5 | 1073741824;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 732 */                       strMo4376v22 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 31);
/* 738 */                       i3 = i5 | Integer.MIN_VALUE;
/* 740 */                       i = i3;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 32:
/* 705 */                       bool = bool;
/* 707 */                       bool2 = bool2;
/* 715 */                       iMo4371q = interfaceC1870kyMo3297c.mo4371q(descriptor2, 32);
/* 719 */                       i4 |= 1;
/* 616 */                       i = i5;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 688 */                       bool = bool;
/* 690 */                       bool2 = bool2;
/* 698 */                       iMo4371q2 = interfaceC1870kyMo3297c.mo4371q(descriptor2, 33);
/* 702 */                       i4 |= 2;
/* 616 */                       i = i5;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 671 */                       bool = bool;
/* 673 */                       bool2 = bool2;
/* 681 */                       zMo4374t4 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 34);
/* 685 */                       i4 |= 4;
/* 616 */                       i = i5;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 646 */                       bool = bool;
/* 648 */                       bool2 = bool2;
/* 666 */                       i4 |= 8;
/* 664 */                       str6 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 35, vh2.f18183a, str6);
/* 616 */                       i = i5;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 621 */                       bool = bool;
/* 630 */                       bool2 = bool2;
/* 641 */                       i4 |= 16;
/* 639 */                       list5 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 36, kSerializerArr[36], list5);
/* 616 */                       i = i5;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 37:
/* 601 */                       bool = bool;
/* 612 */                       i4 |= 32;
/* 610 */                       bool2 = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 37, C0920fk.f8246a, bool2);
/* 616 */                       i = i5;
/* 618 */                       bool = bool;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 38:
/* 568 */                       bool2 = bool2;
/* 574 */                       list = list;
/* 582 */                       bool = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 38, C0920fk.f8246a, bool);
/* 584 */                       i4 |= 64;
/* 586 */                       i = i5;
/* 588 */                       list = list;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 39:
/* 558 */                       zMo4374t5 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 39);
/* 562 */                       i4 |= 128;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 544 */                       strMo4376v25 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 40);
/* 548 */                       i4 |= NotificationCompat.FLAG_LOCAL_ONLY;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 530 */                       zMo4374t6 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 41);
/* 534 */                       i4 |= NotificationCompat.FLAG_GROUP_SUMMARY;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 42:
/* 518 */                       list2 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 42, kSerializerArr[42], list2);
/* 520 */                       i4 |= Segment.SHARE_MINIMUM;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 43:
/* 497 */                       zMo4374t7 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 43);
/* 501 */                       i4 |= 2048;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 44:
/* 485 */                       list3 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 44, kSerializerArr[44], list3);
/* 487 */                       i4 |= 4096;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 45:
/* 466 */                       pk2Var = (pk2) interfaceC1870kyMo3297c.mo4350A(descriptor2, 45, kSerializerArr[45], pk2Var);
/* 468 */                       i4 |= Segment.SIZE;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 46:
/* 447 */                       list4 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 46, kSerializerArr[46], list4);
/* 449 */                       i4 |= Http2.INITIAL_MAX_FRAME_SIZE;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 47:
/* 426 */                       zMo4374t8 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 47);
/* 430 */                       i4 |= 32768;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 48:
/* 412 */                       zMo4374t9 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 48);
/* 416 */                       i4 |= 65536;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 49:
/* 398 */                       zMo4374t10 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 49);
/* 402 */                       i4 |= 131072;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 384 */                       zMo4374t11 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 50);
/* 388 */                       i4 |= 262144;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 51:
/* 370 */                       zMo4374t12 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 51);
/* 374 */                       i4 |= 524288;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 52:
/* 359 */                       str3 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 52, vh2.f18183a, str3);
/* 361 */                       i4 |= 1048576;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 53:
/* 341 */                       str4 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 53, vh2.f18183a, str4);
/* 343 */                       i4 |= 2097152;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 54:
/* 323 */                       str5 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 54, vh2.f18183a, str5);
/* 325 */                       i4 |= 4194304;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 55:
/* 305 */                       str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 55, vh2.f18183a, str2);
/* 307 */                       i4 |= 8388608;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 56:
/* 287 */                       str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 56, vh2.f18183a, str);
/* 289 */                       i4 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 57:
/* 269 */                       tCF2ChangedPurposes = (TCF2ChangedPurposes) interfaceC1870kyMo3297c.mo4377y(descriptor2, 57, TCF2ChangedPurposes$$serializer.INSTANCE, tCF2ChangedPurposes);
/* 271 */                       i4 |= 33554432;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 58:
/* 249 */                       zMo4374t13 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 58);
/* 253 */                       i4 |= 67108864;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 59:
/* 234 */                       list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 59, kSerializerArr[59], list);
/* 236 */                       i4 |= 134217728;
/* 238 */                       i = i5;
/* 240 */                       bool = bool;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 60:
/* 214 */                       zMo4374t14 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 60);
/* 218 */                       i4 |= 268435456;
/* 194 */                       i = i5;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 61:
/* 203 */                       strMo4376v30 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 61);
/* 207 */                       i4 |= 536870912;
/* 194 */                       i = i5;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            case 62:
/* 188 */                       zMo4374t15 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 62);
/* 192 */                       i4 |= 1073741824;
/* 194 */                       i = i5;
/* 1372 */                      i5 = i;
/* 1374 */                      bool2 = bool2;
                                break;
                            default:
/* 180 */                       C1951n4.m6855e(iMo3299x);
/* 18 */                        return null;
                        }
                    }
/* 1378 */          Boolean bool3 = bool;
/* 1382 */          List list6 = list;
/* 1384 */          int i6 = i5;
/* 1386 */          fj0 fj0Var2 = fj0Var;
/* 1388 */          interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 1391 */          String str7 = str3;
/* 1409 */          String str8 = str4;
/* 1413 */          String str9 = str6;
/* 1423 */          String str10 = str5;
/* 1438 */          return new TCF2Settings(i6, i4, strMo4376v23, strMo4376v24, strMo4376v26, strMo4376v27, strMo4376v28, strMo4376v29, strMo4376v, strMo4376v2, strMo4376v3, strMo4376v4, strMo4376v5, strMo4376v6, strMo4376v7, strMo4376v8, strMo4376v9, strMo4376v10, strMo4376v11, strMo4376v12, strMo4376v13, strMo4376v14, strMo4376v15, strMo4376v16, strMo4376v17, fj0Var2, zMo4374t, zMo4374t2, zMo4374t3, strMo4376v18, strMo4376v19, strMo4376v20, strMo4376v21, strMo4376v22, iMo4371q, iMo4371q2, zMo4374t4, str9, list5, bool2, bool3, zMo4374t5, strMo4376v25, zMo4374t6, list2, zMo4374t7, list3, pk2Var, list4, zMo4374t8, zMo4374t9, zMo4374t10, zMo4374t11, zMo4374t12, str7, str8, str10, str2, str, tCF2ChangedPurposes, zMo4374t13, list6, zMo4374t14, strMo4376v30, zMo4374t15);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                /* JADX WARN: Code duplicated, block: B:100:0x026b  */
                /* JADX WARN: Code duplicated, block: B:106:0x0281 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:107:0x0283  */
                /* JADX WARN: Code duplicated, block: B:110:0x0290  */
                /* JADX WARN: Code duplicated, block: B:111:0x0293  */
                /* JADX WARN: Code duplicated, block: B:116:0x02aa  */
                /* JADX WARN: Code duplicated, block: B:117:0x02ad  */
                /* JADX WARN: Code duplicated, block: B:122:0x02bd  */
                /* JADX WARN: Code duplicated, block: B:123:0x02c0  */
                /* JADX WARN: Code duplicated, block: B:128:0x02d7  */
                /* JADX WARN: Code duplicated, block: B:129:0x02da  */
                /* JADX WARN: Code duplicated, block: B:134:0x02ed  */
                /* JADX WARN: Code duplicated, block: B:135:0x02f0  */
                /* JADX WARN: Code duplicated, block: B:141:0x0308 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:142:0x030a  */
                /* JADX WARN: Code duplicated, block: B:146:0x0318 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:147:0x031a  */
                /* JADX WARN: Code duplicated, block: B:151:0x0328 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:152:0x032a  */
                /* JADX WARN: Code duplicated, block: B:156:0x0338 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:157:0x033a  */
                /* JADX WARN: Code duplicated, block: B:161:0x0348 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:162:0x034a  */
                /* JADX WARN: Code duplicated, block: B:166:0x0358 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:167:0x035a  */
                /* JADX WARN: Code duplicated, block: B:171:0x036a A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:172:0x036c  */
                /* JADX WARN: Code duplicated, block: B:176:0x037c A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:177:0x037e  */
                /* JADX WARN: Code duplicated, block: B:181:0x038e A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:182:0x0390  */
                /* JADX WARN: Code duplicated, block: B:186:0x03a0 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:187:0x03a2  */
                /* JADX WARN: Code duplicated, block: B:191:0x03b2 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:192:0x03b4  */
                /* JADX WARN: Code duplicated, block: B:196:0x03c4 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:197:0x03c6  */
                /* JADX WARN: Code duplicated, block: B:200:0x03d3  */
                /* JADX WARN: Code duplicated, block: B:201:0x03d6  */
                /* JADX WARN: Code duplicated, block: B:207:0x03ee A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:208:0x03f0  */
                /* JADX WARN: Code duplicated, block: B:211:0x03fd  */
                /* JADX WARN: Code duplicated, block: B:212:0x0400  */
                /* JADX WARN: Code duplicated, block: B:218:0x0414  */
                /* JADX WARN: Code duplicated, block: B:220:0x0418  */
                /* JADX WARN: Code duplicated, block: B:82:0x0229  */
                /* JADX WARN: Code duplicated, block: B:83:0x022c  */
                /* JADX WARN: Code duplicated, block: B:89:0x0244 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:90:0x0246  */
                /* JADX WARN: Code duplicated, block: B:93:0x0255  */
                /* JADX WARN: Code duplicated, block: B:94:0x0258  */
                /* JADX WARN: Code duplicated, block: B:99:0x0268  */
                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Iterative traversal limit reached: limit: 970, visitor: jadx.core.dex.visitors.regions.IfRegionVisitor$RemoveRedundantElseVisitor, blocks count: 194
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:51)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:46)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                    */
                @Override // kotlinx.serialization.KSerializer
                public void serialize(kotlinx.serialization.encoding.Encoder r44, com.usercentrics.sdk.p009v2.settings.data.TCF2Settings r45) {
                    /*
                        Method dump skipped, instruction units count: 1059
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.usercentrics.sdk.p009v2.settings.data.TCF2Settings$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.usercentrics.sdk.v2.settings.data.TCF2Settings):void");
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
