            package io.flutter.plugin.localization;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.os.Build;
            import android.os.LocaleList;
            import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            import p000.fm0;
            import p000.wt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class LocalizationPlugin {
                private final Context context;
                private final LocalizationChannel localizationChannel;
                final LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;

                public LocalizationPlugin(Context context, LocalizationChannel localizationChannel) {
/* 6 */             LocalizationChannel.LocalizationMessageHandler localizationMessageHandler = new LocalizationChannel.LocalizationMessageHandler() { // from class: io.flutter.plugin.localization.LocalizationPlugin.1
                        @Override // io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler
                        public String getStringResource(String str, String str2) {
/* 1 */                     Context contextCreateConfigurationContext = LocalizationPlugin.this.context;
/* 7 */                     if (str2 != null) {
/* 9 */                         Locale localeLocaleFromString = LocalizationPlugin.localeFromString(str2);
/* 29 */                        Configuration configuration = new Configuration(LocalizationPlugin.this.context.getResources().getConfiguration());
/* 32 */                        configuration.setLocale(localeLocaleFromString);
/* 41 */                        contextCreateConfigurationContext = LocalizationPlugin.this.context.createConfigurationContext(configuration);
                            }
/* 61 */                    int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", LocalizationPlugin.this.context.getPackageName());
/* 65 */                    if (identifier != 0) {
/* 71 */                        return contextCreateConfigurationContext.getResources().getString(identifier);
                            }
/* 76 */                    return null;
                        }
                    };
/* 9 */             this.localizationMessageHandler = localizationMessageHandler;
/* 11 */            this.context = context;
/* 13 */            this.localizationChannel = localizationChannel;
/* 15 */            localizationChannel.setLocalizationMessageHandler(localizationMessageHandler);
                }

                public static Locale localeFromString(String str) {
/* 3 */             Locale.Builder builder = new Locale.Builder();
/* 16 */            String[] strArrSplit = str.replace('_', '-').split("-");
/* 23 */            builder.setLanguage(strArrSplit[0]);
/* 28 */            int i = 1;
/* 29 */            if (strArrSplit.length > 1 && strArrSplit[1].length() == 4) {
/* 42 */                builder.setScript(strArrSplit[1]);
/* 45 */                i = 2;
                    }
/* 47 */            if (strArrSplit.length > i && strArrSplit[i].length() >= 2 && strArrSplit[i].length() <= 3) {
/* 68 */                builder.setRegion(strArrSplit[i]);
                    }
/* 71 */            return builder.build();
                }

                public Locale resolveNativeLocale(List<Locale> list) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 293 */               return null;
                    }
/* 16 */            if (Build.VERSION.SDK_INT < 26) {
/* 183 */               LocaleList locales = this.context.getResources().getConfiguration().getLocales();
/* 192 */               for (int i = 0; i < locales.size(); i++) {
/* 194 */                   Locale locale = locales.get(i);
/* 206 */                   for (Locale locale2 : list) {
/* 218 */                       if (locale.equals(locale2)) {
/* 220 */                           return locale2;
                                }
                            }
/* 229 */                   for (Locale locale3 : list) {
/* 249 */                       if (locale.getLanguage().equals(locale3.toLanguageTag())) {
/* 251 */                           return locale3;
                                }
                            }
/* 260 */                   for (Locale locale4 : list) {
/* 280 */                       if (locale.getLanguage().equals(locale4.getLanguage())) {
/* 282 */                           return locale4;
                                }
                            }
                        }
/* 286 */               return list.get(0);
                    }
/* 20 */            ArrayList arrayList = new ArrayList();
/* 33 */            LocaleList locales2 = this.context.getResources().getConfiguration().getLocales();
/* 37 */            int size = locales2.size();
/* 42 */            for (int i2 = 0; i2 < size; i2++) {
/* 44 */                Locale locale5 = locales2.get(i2);
/* 48 */                String language = locale5.getLanguage();
/* 62 */                if (!locale5.getScript().isEmpty()) {
/* 64 */                    StringBuilder sbM3794t = fm0.m3794t(language, "-");
/* 72 */                    sbM3794t.append(locale5.getScript());
/* 75 */                    language = sbM3794t.toString();
                        }
/* 87 */                if (!locale5.getCountry().isEmpty()) {
/* 89 */                    StringBuilder sbM3794t2 = fm0.m3794t(language, "-");
/* 97 */                    sbM3794t2.append(locale5.getCountry());
/* 100 */                   language = sbM3794t2.toString();
                        }
/* 108 */               arrayList.add(wt0.m9631p(language));
/* 111 */               wt0.m9633r();
/* 122 */               arrayList.add(wt0.m9631p(locale5.getLanguage()));
/* 125 */               wt0.m9633r();
/* 153 */               arrayList.add(wt0.m9614C(locale5.getLanguage() + "-*"));
                    }
/* 1 */             Locale localeLookup = Locale.lookup(arrayList, list);
                    return localeLookup != null ? localeLookup : list.get(0);
                }

                public void sendLocalesToFlutter(Configuration configuration) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             LocaleList locales = configuration.getLocales();
/* 10 */            int size = locales.size();
/* 15 */            for (int i = 0; i < size; i++) {
/* 21 */                arrayList.add(locales.get(i));
                    }
/* 29 */            this.localizationChannel.sendLocales(arrayList);
                }
            }
