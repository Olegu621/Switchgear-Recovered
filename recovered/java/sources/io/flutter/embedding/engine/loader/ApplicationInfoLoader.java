            package io.flutter.embedding.engine.loader;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.content.res.XmlResourceParser;
            import android.os.Bundle;
            import java.io.IOException;
            import org.json.JSONArray;
            import org.xmlpull.v1.XmlPullParserException;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ApplicationInfoLoader {
                public static final String NETWORK_POLICY_METADATA_KEY = "io.flutter.network-policy";
                public static final String PUBLIC_AUTOMATICALLY_REGISTER_PLUGINS_METADATA_KEY = "io.flutter.automatically-register-plugins";
                public static final String PUBLIC_AOT_SHARED_LIBRARY_NAME = FlutterLoader.class.getName().concat(".aot-shared-library-name");
                public static final String PUBLIC_VM_SNAPSHOT_DATA_KEY = FlutterLoader.class.getName().concat(".vm-snapshot-data");
                public static final String PUBLIC_ISOLATE_SNAPSHOT_DATA_KEY = FlutterLoader.class.getName().concat(".isolate-snapshot-data");
                public static final String PUBLIC_FLUTTER_ASSETS_DIR_KEY = FlutterLoader.class.getName().concat(".flutter-assets-dir");

                private static ApplicationInfo getApplicationInfo(Context context) {
                    try {
/* 11 */                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    } catch (PackageManager.NameNotFoundException e) {
/* 17 */                ds0.m3199p(e);
/* 20 */                return null;
                    }
                }

                private static boolean getBoolean(Bundle bundle, String str, boolean z) {
                    return bundle == null ? z : bundle.getBoolean(str, z);
                }

                private static String getNetworkPolicy(ApplicationInfo applicationInfo, Context context) {
                    int i;
/* 1 */             Bundle bundle = applicationInfo.metaData;
/* 4 */             if (bundle == null || (i = bundle.getInt(NETWORK_POLICY_METADATA_KEY, 0)) <= 0) {
/* 3 */                 return null;
                    }
/* 19 */            JSONArray jSONArray = new JSONArray();
                    try {
/* 26 */                XmlResourceParser xml = context.getResources().getXml(i);
/* 30 */                xml.next();
/* 38 */                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
/* 41 */                    if (eventType == 2 && xml.getName().equals("domain-config")) {
/* 55 */                        parseDomainConfig(xml, jSONArray, false);
                            }
                        }
/* 63 */                return jSONArray.toString();
                    } catch (IOException | XmlPullParserException unused) {
/* 3 */                 return null;
                    }
                }

                private static String getString(Bundle bundle, String str) {
/* 2 */             if (bundle == null) {
/* 1 */                 return null;
                    }
/* 5 */             return bundle.getString(str, null);
                }

                public static FlutterApplicationInfo load(Context context) {
/* 1 */             ApplicationInfo applicationInfo = getApplicationInfo(context);
/* 54 */            return new FlutterApplicationInfo(getString(applicationInfo.metaData, PUBLIC_AOT_SHARED_LIBRARY_NAME), getString(applicationInfo.metaData, PUBLIC_VM_SNAPSHOT_DATA_KEY), getString(applicationInfo.metaData, PUBLIC_ISOLATE_SNAPSHOT_DATA_KEY), getString(applicationInfo.metaData, PUBLIC_FLUTTER_ASSETS_DIR_KEY), getNetworkPolicy(applicationInfo, context), applicationInfo.nativeLibraryDir, getBoolean(applicationInfo.metaData, PUBLIC_AUTOMATICALLY_REGISTER_PLUGINS_METADATA_KEY, true));
                }

                private static void parseDomain(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) throws XmlPullParserException, IOException {
/* 5 */             boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
/* 9 */             xmlResourceParser.next();
/* 17 */            if (xmlResourceParser.getEventType() != 4) {
/* 63 */                f42.m3656l("Expected text");
/* 66 */                return;
                    }
/* 23 */            String strTrim = xmlResourceParser.getText().trim();
/* 29 */            JSONArray jSONArray2 = new JSONArray();
/* 32 */            jSONArray2.put(strTrim);
/* 35 */            jSONArray2.put(attributeBooleanValue);
/* 38 */            jSONArray2.put(z);
/* 41 */            jSONArray.put(jSONArray2);
/* 44 */            xmlResourceParser.next();
/* 52 */            if (xmlResourceParser.getEventType() == 3) {
/* 54 */                return;
                    }
/* 57 */            f42.m3656l("Expected end of domain tag");
                }

                private static void parseDomainConfig(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) throws XmlPullParserException, IOException {
/* 4 */             boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z);
                    while (true) {
/* 8 */                 int next = xmlResourceParser.next();
/* 13 */                if (next == 2) {
/* 25 */                    if (xmlResourceParser.getName().equals("domain")) {
/* 27 */                        parseDomain(xmlResourceParser, jSONArray, attributeBooleanValue);
                            } else if (xmlResourceParser.getName().equals("domain-config")) {
/* 43 */                        parseDomainConfig(xmlResourceParser, jSONArray, attributeBooleanValue);
                            } else {
/* 47 */                        skipTag(xmlResourceParser);
                            }
                        } else if (next == 3) {
/* 54 */                    return;
                        }
                    }
                }

                private static void skipTag(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
/* 1 */             String name = xmlResourceParser.getName();
/* 5 */             int eventType = xmlResourceParser.getEventType();
                    while (true) {
/* 10 */                if (eventType == 3 && xmlResourceParser.getName() == name) {
/* 19 */                    return;
                        } else {
/* 20 */                    eventType = xmlResourceParser.next();
                        }
                    }
                }
            }
