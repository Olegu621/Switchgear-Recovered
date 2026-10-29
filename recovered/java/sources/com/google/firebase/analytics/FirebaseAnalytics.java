            package com.google.firebase.analytics;

            import android.app.Activity;
            import android.content.Context;
            import android.os.Bundle;
            import com.google.android.gms.internal.measurement.zzdf;
            import com.google.android.gms.internal.measurement.zzfb;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.installations.FirebaseInstallations;
            import io.sentry.C1697u2;
            import java.util.Map;
            import java.util.concurrent.ArrayBlockingQueue;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import p000.kb1;
            import p000.tl3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class FirebaseAnalytics {
                private static volatile FirebaseAnalytics zza;
                private final zzfb zzb;
                private ExecutorService zzc;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum ConsentStatus {
                    GRANTED,
                    DENIED
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum ConsentType {
                    AD_STORAGE,
                    ANALYTICS_STORAGE,
                    AD_USER_DATA,
                    AD_PERSONALIZATION
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Event {
                    public static final String ADD_PAYMENT_INFO = "add_payment_info";
                    public static final String ADD_SHIPPING_INFO = "add_shipping_info";
                    public static final String ADD_TO_CART = "add_to_cart";
                    public static final String ADD_TO_WISHLIST = "add_to_wishlist";
                    public static final String AD_IMPRESSION = "ad_impression";
                    public static final String APP_OPEN = "app_open";
                    public static final String BEGIN_CHECKOUT = "begin_checkout";
                    public static final String CAMPAIGN_DETAILS = "campaign_details";
                    public static final String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";
                    public static final String GENERATE_LEAD = "generate_lead";
                    public static final String JOIN_GROUP = "join_group";
                    public static final String LEVEL_END = "level_end";
                    public static final String LEVEL_START = "level_start";
                    public static final String LEVEL_UP = "level_up";
                    public static final String LOGIN = "login";
                    public static final String POST_SCORE = "post_score";
                    public static final String PURCHASE = "purchase";
                    public static final String REFUND = "refund";
                    public static final String REMOVE_FROM_CART = "remove_from_cart";
                    public static final String SCREEN_VIEW = "screen_view";
                    public static final String SEARCH = "search";
                    public static final String SELECT_CONTENT = "select_content";
                    public static final String SELECT_ITEM = "select_item";
                    public static final String SELECT_PROMOTION = "select_promotion";
                    public static final String SHARE = "share";
                    public static final String SIGN_UP = "sign_up";
                    public static final String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";
                    public static final String TUTORIAL_BEGIN = "tutorial_begin";
                    public static final String TUTORIAL_COMPLETE = "tutorial_complete";
                    public static final String UNLOCK_ACHIEVEMENT = "unlock_achievement";
                    public static final String VIEW_CART = "view_cart";
                    public static final String VIEW_ITEM = "view_item";
                    public static final String VIEW_ITEM_LIST = "view_item_list";
                    public static final String VIEW_PROMOTION = "view_promotion";
                    public static final String VIEW_SEARCH_RESULTS = "view_search_results";
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Param {
                    public static final String ACHIEVEMENT_ID = "achievement_id";
                    public static final String ACLID = "aclid";
                    public static final String AD_FORMAT = "ad_format";
                    public static final String AD_PLATFORM = "ad_platform";
                    public static final String AD_SOURCE = "ad_source";
                    public static final String AD_UNIT_NAME = "ad_unit_name";
                    public static final String AFFILIATION = "affiliation";
                    public static final String CAMPAIGN = "campaign";
                    public static final String CAMPAIGN_ID = "campaign_id";
                    public static final String CHARACTER = "character";
                    public static final String CONTENT = "content";
                    public static final String CONTENT_TYPE = "content_type";
                    public static final String COUPON = "coupon";
                    public static final String CP1 = "cp1";
                    public static final String CREATIVE_FORMAT = "creative_format";
                    public static final String CREATIVE_NAME = "creative_name";
                    public static final String CREATIVE_SLOT = "creative_slot";
                    public static final String CURRENCY = "currency";
                    public static final String DESTINATION = "destination";
                    public static final String DISCOUNT = "discount";
                    public static final String END_DATE = "end_date";
                    public static final String EXTEND_SESSION = "extend_session";
                    public static final String FLIGHT_NUMBER = "flight_number";
                    public static final String GROUP_ID = "group_id";
                    public static final String INDEX = "index";
                    public static final String ITEMS = "items";
                    public static final String ITEM_BRAND = "item_brand";
                    public static final String ITEM_CATEGORY = "item_category";
                    public static final String ITEM_CATEGORY2 = "item_category2";
                    public static final String ITEM_CATEGORY3 = "item_category3";
                    public static final String ITEM_CATEGORY4 = "item_category4";
                    public static final String ITEM_CATEGORY5 = "item_category5";
                    public static final String ITEM_ID = "item_id";
                    public static final String ITEM_LIST_ID = "item_list_id";
                    public static final String ITEM_LIST_NAME = "item_list_name";
                    public static final String ITEM_NAME = "item_name";
                    public static final String ITEM_VARIANT = "item_variant";
                    public static final String LEVEL = "level";
                    public static final String LEVEL_NAME = "level_name";
                    public static final String LOCATION = "location";
                    public static final String LOCATION_ID = "location_id";
                    public static final String MARKETING_TACTIC = "marketing_tactic";
                    public static final String MEDIUM = "medium";
                    public static final String METHOD = "method";
                    public static final String NUMBER_OF_NIGHTS = "number_of_nights";
                    public static final String NUMBER_OF_PASSENGERS = "number_of_passengers";
                    public static final String NUMBER_OF_ROOMS = "number_of_rooms";
                    public static final String ORIGIN = "origin";
                    public static final String PAYMENT_TYPE = "payment_type";
                    public static final String PRICE = "price";
                    public static final String PROMOTION_ID = "promotion_id";
                    public static final String PROMOTION_NAME = "promotion_name";
                    public static final String QUANTITY = "quantity";
                    public static final String SCORE = "score";
                    public static final String SCREEN_CLASS = "screen_class";
                    public static final String SCREEN_NAME = "screen_name";
                    public static final String SEARCH_TERM = "search_term";
                    public static final String SHIPPING = "shipping";
                    public static final String SHIPPING_TIER = "shipping_tier";
                    public static final String SOURCE = "source";
                    public static final String SOURCE_PLATFORM = "source_platform";
                    public static final String START_DATE = "start_date";
                    public static final String SUCCESS = "success";
                    public static final String TAX = "tax";
                    public static final String TERM = "term";
                    public static final String TRANSACTION_ID = "transaction_id";
                    public static final String TRAVEL_CLASS = "travel_class";
                    public static final String VALUE = "value";
                    public static final String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class UserProperty {
                    public static final String ALLOW_AD_PERSONALIZATION_SIGNALS = "allow_personalized_ads";
                    public static final String SIGN_UP_METHOD = "sign_up_method";
                }

                public FirebaseAnalytics(zzfb zzfbVar) {
/* 4 */             kb1.m6061n(zzfbVar);
/* 7 */             this.zzb = zzfbVar;
                }

                public static FirebaseAnalytics getInstance(Context context) {
/* 3 */             if (zza == null) {
                        synchronized (FirebaseAnalytics.class) {
                            try {
/* 10 */                        if (zza == null) {
/* 22 */                            zza = new FirebaseAnalytics(zzfb.zza(context, null));
                                }
                            } catch (Throwable th) {
/* 30 */                        throw th;
                            }
                        }
                    }
/* 31 */            return zza;
                }

                public static tl3 getScionFrontendApiImplementation(Context context, Bundle bundle) {
/* 1 */             zzfb zzfbVarZza = zzfb.zza(context, bundle);
/* 5 */             if (zzfbVarZza == null) {
/* 7 */                 return null;
                    }
/* 11 */            return new zzd(zzfbVarZza);
                }

                private final ExecutorService zzb() {
                    FirebaseAnalytics firebaseAnalytics;
                    ExecutorService executorService;
                    synchronized (FirebaseAnalytics.class) {
                        try {
/* 6 */                     if (this.zzc == null) {
/* 23 */                        firebaseAnalytics = this;
/* 27 */                        firebaseAnalytics.zzc = new zza(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                            } else {
/* 33 */                        firebaseAnalytics = this;
                            }
/* 34 */                    executorService = firebaseAnalytics.zzc;
                        } catch (Throwable th) {
/* 39 */                    throw th;
                        }
                    }
/* 37 */            return executorService;
                }

                public Task<String> getAppInstanceId() {
                    try {
/* 10 */                return Tasks.call(zzb(), new zzb(this));
                    } catch (RuntimeException e) {
/* 24 */                this.zzb.zzD(5, "Failed to schedule task for getAppInstanceId", null, null, null);
/* 27 */                return Tasks.forException(e);
                    }
                }

                public String getFirebaseInstanceId() {
                    try {
/* 17 */                return (String) Tasks.await(FirebaseInstallations.getInstance().getId(), 30000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
/* 21 */                C1697u2.m5439o(e);
/* 24 */                return null;
                    } catch (ExecutionException e2) {
/* 39 */                C1697u2.m5439o(e2.getCause());
/* 24 */                return null;
                    } catch (TimeoutException unused) {
/* 33 */                throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
                    }
                }

                public Task<Long> getSessionId() {
                    try {
/* 10 */                return Tasks.call(zzb(), new zzc(this));
                    } catch (RuntimeException e) {
/* 24 */                this.zzb.zzD(5, "Failed to schedule task for getSessionId", null, null, null);
/* 27 */                return Tasks.forException(e);
                    }
                }

                public void logEvent(String str, Bundle bundle) {
/* 3 */             this.zzb.zzh(str, bundle);
                }

                public void resetAnalyticsData() {
/* 3 */             this.zzb.zzs();
                }

                public void setAnalyticsCollectionEnabled(boolean z) {
/* 7 */             this.zzb.zzq(Boolean.valueOf(z));
                }

                public void setConsent(Map<ConsentType, ConsentStatus> map) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
/* 19 */            if (consentStatus != null) {
/* 21 */                int iOrdinal = consentStatus.ordinal();
/* 27 */                if (iOrdinal == 0) {
/* 36 */                    bundle.putString("ad_storage", "granted");
                        } else if (iOrdinal == 1) {
/* 32 */                    bundle.putString("ad_storage", "denied");
                        }
                    }
/* 41 */            ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
/* 47 */            if (consentStatus2 != null) {
/* 49 */                int iOrdinal2 = consentStatus2.ordinal();
/* 55 */                if (iOrdinal2 == 0) {
/* 64 */                    bundle.putString("analytics_storage", "granted");
                        } else if (iOrdinal2 == 1) {
/* 60 */                    bundle.putString("analytics_storage", "denied");
                        }
                    }
/* 69 */            ConsentStatus consentStatus3 = map.get(ConsentType.AD_USER_DATA);
/* 75 */            if (consentStatus3 != null) {
/* 77 */                int iOrdinal3 = consentStatus3.ordinal();
/* 83 */                if (iOrdinal3 == 0) {
/* 92 */                    bundle.putString("ad_user_data", "granted");
                        } else if (iOrdinal3 == 1) {
/* 88 */                    bundle.putString("ad_user_data", "denied");
                        }
                    }
/* 97 */            ConsentStatus consentStatus4 = map.get(ConsentType.AD_PERSONALIZATION);
/* 103 */           if (consentStatus4 != null) {
/* 105 */               int iOrdinal4 = consentStatus4.ordinal();
/* 111 */               if (iOrdinal4 == 0) {
/* 120 */                   bundle.putString("ad_personalization", "granted");
                        } else if (iOrdinal4 == 1) {
/* 116 */                   bundle.putString("ad_personalization", "denied");
                        }
                    }
/* 125 */           this.zzb.zzr(bundle);
                }

                @Deprecated
                public void setCurrentScreen(Activity activity, String str, String str2) {
/* 7 */             this.zzb.zzp(zzdf.zza(activity), str, str2);
                }

                public void setDefaultEventParameters(Bundle bundle) {
/* 1 */             if (bundle != null) {
/* 5 */                 bundle = new Bundle(bundle);
                    }
/* 11 */            this.zzb.zzL(bundle);
                }

                public void setSessionTimeoutDuration(long j) {
/* 3 */             this.zzb.zzt(j);
                }

                public void setUserId(String str) {
/* 3 */             this.zzb.zzo(str);
                }

                public void setUserProperty(String str, String str2) {
/* 5 */             this.zzb.zzk(null, str, str2, false);
                }

                public final /* synthetic */ zzfb zza() {
/* 1 */             return this.zzb;
                }
            }
