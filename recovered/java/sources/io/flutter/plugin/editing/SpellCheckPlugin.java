            package io.flutter.plugin.editing;

            import android.view.textservice.SentenceSuggestionsInfo;
            import android.view.textservice.SpellCheckerSession;
            import android.view.textservice.SuggestionsInfo;
            import android.view.textservice.TextInfo;
            import android.view.textservice.TextServicesManager;
            import io.flutter.embedding.engine.systemchannels.SpellCheckChannel;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.localization.LocalizationPlugin;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SpellCheckPlugin implements SpellCheckChannel.SpellCheckMethodHandler, SpellCheckerSession.SpellCheckerSessionListener {
                public static final String END_INDEX_KEY = "endIndex";
                private static final int MAX_SPELL_CHECK_SUGGESTIONS = 5;
                public static final String START_INDEX_KEY = "startIndex";
                public static final String SUGGESTIONS_KEY = "suggestions";
                private final SpellCheckChannel mSpellCheckChannel;
                private SpellCheckerSession mSpellCheckerSession;
                private final TextServicesManager mTextServicesManager;
                MethodChannel.Result pendingResult;

                public SpellCheckPlugin(TextServicesManager textServicesManager, SpellCheckChannel spellCheckChannel) {
/* 4 */             this.mTextServicesManager = textServicesManager;
/* 6 */             this.mSpellCheckChannel = spellCheckChannel;
/* 8 */             spellCheckChannel.setSpellCheckMethodHandler(this);
                }

                public void destroy() {
/* 4 */             this.mSpellCheckChannel.setSpellCheckMethodHandler(null);
/* 7 */             SpellCheckerSession spellCheckerSession = this.mSpellCheckerSession;
/* 9 */             if (spellCheckerSession != null) {
/* 11 */                spellCheckerSession.close();
                    }
                }

                @Override // io.flutter.embedding.engine.systemchannels.SpellCheckChannel.SpellCheckMethodHandler
                public void initiateSpellCheck(String str, String str2, MethodChannel.Result result) {
/* 3 */             if (this.pendingResult != null) {
/* 10 */                result.error("error", "Previous spell check request still pending.", null);
                    } else {
/* 14 */                this.pendingResult = result;
/* 16 */                performSpellCheck(str, str2);
                    }
                }

                @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
                public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
/* 3 */             if (sentenceSuggestionsInfoArr.length == 0) {
/* 12 */                this.pendingResult.success(new ArrayList());
/* 15 */                this.pendingResult = null;
/* 17 */                return;
                    }
/* 20 */            ArrayList arrayList = new ArrayList();
/* 24 */            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
/* 26 */            if (sentenceSuggestionsInfo == null) {
/* 35 */                this.pendingResult.success(new ArrayList());
/* 38 */                this.pendingResult = null;
/* 40 */                return;
                    }
/* 46 */            for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); i++) {
/* 48 */                SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
/* 52 */                int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
/* 56 */                if (suggestionsCount > 0) {
/* 61 */                    HashMap map = new HashMap();
/* 64 */                    int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i);
/* 72 */                    int lengthAt = sentenceSuggestionsInfo.getLengthAt(i) + offsetAt;
/* 79 */                    map.put(START_INDEX_KEY, Integer.valueOf(offsetAt));
/* 88 */                    map.put(END_INDEX_KEY, Integer.valueOf(lengthAt));
/* 93 */                    ArrayList arrayList2 = new ArrayList();
/* 97 */                    boolean z = false;
/* 98 */                    for (int i2 = 0; i2 < suggestionsCount; i2++) {
/* 100 */                       String suggestionAt = suggestionsInfoAt.getSuggestionAt(i2);
/* 110 */                       if (!suggestionAt.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 112 */                           arrayList2.add(suggestionAt);
/* 115 */                           z = true;
                                }
                            }
/* 119 */                   if (z) {
/* 124 */                       map.put(SUGGESTIONS_KEY, arrayList2);
/* 127 */                       arrayList.add(map);
                            }
                        }
                    }
/* 135 */           this.pendingResult.success(arrayList);
/* 138 */           this.pendingResult = null;
                }

                @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
                public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
                }

                public void performSpellCheck(String str, String str2) {
/* 1 */             Locale localeLocaleFromString = LocalizationPlugin.localeFromString(str);
/* 7 */             if (this.mSpellCheckerSession == null) {
/* 17 */                this.mSpellCheckerSession = this.mTextServicesManager.newSpellCheckerSession(null, localeLocaleFromString, this, true);
                    }
/* 31 */            this.mSpellCheckerSession.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
                }
            }
