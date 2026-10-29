            package androidx.core.app;

            import android.app.Notification;
            import android.app.PendingIntent;
            import android.app.RemoteInput;
            import android.content.Context;
            import android.content.LocusId;
            import android.content.res.Resources;
            import android.graphics.Bitmap;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Icon;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import androidx.core.R$dimen;
            import androidx.core.graphics.drawable.IconCompat;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import p000.C1951n4;
            import p000.ao1;
            import p000.bo1;
            import p000.co1;
            import p000.do1;
            import p000.eo1;
            import p000.fo1;
            import p000.g32;
            import p000.gv0;
            import p000.kb1;
            import p000.ko1;
            import p000.lo1;
            import p000.no1;
            import p000.sk0;
            import p000.w91;
            import p000.wr1;
            import p000.x91;
            import p000.xr1;
            import p000.yn1;
            import p000.zn1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class NotificationCompat {
                public static final int BADGE_ICON_LARGE = 2;
                public static final int BADGE_ICON_NONE = 0;
                public static final int BADGE_ICON_SMALL = 1;
                public static final String CATEGORY_ALARM = "alarm";
                public static final String CATEGORY_CALL = "call";
                public static final String CATEGORY_EMAIL = "email";
                public static final String CATEGORY_ERROR = "err";
                public static final String CATEGORY_EVENT = "event";
                public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
                public static final String CATEGORY_MESSAGE = "msg";
                public static final String CATEGORY_MISSED_CALL = "missed_call";
                public static final String CATEGORY_NAVIGATION = "navigation";
                public static final String CATEGORY_PROGRESS = "progress";
                public static final String CATEGORY_PROMO = "promo";
                public static final String CATEGORY_RECOMMENDATION = "recommendation";
                public static final String CATEGORY_REMINDER = "reminder";
                public static final String CATEGORY_SERVICE = "service";
                public static final String CATEGORY_SOCIAL = "social";
                public static final String CATEGORY_STATUS = "status";
                public static final String CATEGORY_STOPWATCH = "stopwatch";
                public static final String CATEGORY_SYSTEM = "sys";
                public static final String CATEGORY_TRANSPORT = "transport";
                public static final String CATEGORY_WORKOUT = "workout";
                public static final int COLOR_DEFAULT = 0;
                public static final int DEFAULT_ALL = -1;
                public static final int DEFAULT_LIGHTS = 4;
                public static final int DEFAULT_SOUND = 1;
                public static final int DEFAULT_VIBRATE = 2;
                public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
                public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
                public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
                public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
                public static final String EXTRA_BIG_TEXT = "android.bigText";
                public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
                public static final String EXTRA_CALL_PERSON = "android.callPerson";
                public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
                public static final String EXTRA_CALL_TYPE = "android.callType";
                public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
                public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
                public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
                public static final String EXTRA_COLORIZED = "android.colorized";
                public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
                public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
                public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
                public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
                public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
                public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
                public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
                public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
                public static final String EXTRA_INFO_TEXT = "android.infoText";
                public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
                public static final String EXTRA_LARGE_ICON = "android.largeIcon";
                public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
                public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
                public static final String EXTRA_MESSAGES = "android.messages";
                public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
                public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
                public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

                @Deprecated
                public static final String EXTRA_PEOPLE = "android.people";
                public static final String EXTRA_PEOPLE_LIST = "android.people.list";
                public static final String EXTRA_PICTURE = "android.picture";
                public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
                public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
                public static final String EXTRA_PROGRESS = "android.progress";
                public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
                public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
                public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
                public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
                public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
                public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
                public static final String EXTRA_SHOW_WHEN = "android.showWhen";
                public static final String EXTRA_SMALL_ICON = "android.icon";
                public static final String EXTRA_SUB_TEXT = "android.subText";
                public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
                public static final String EXTRA_TEMPLATE = "android.template";
                public static final String EXTRA_TEXT = "android.text";
                public static final String EXTRA_TEXT_LINES = "android.textLines";
                public static final String EXTRA_TITLE = "android.title";
                public static final String EXTRA_TITLE_BIG = "android.title.big";
                public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
                public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
                public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
                public static final int FLAG_AUTO_CANCEL = 16;
                public static final int FLAG_BUBBLE = 4096;
                public static final int FLAG_FOREGROUND_SERVICE = 64;
                public static final int FLAG_GROUP_SUMMARY = 512;

                @Deprecated
                public static final int FLAG_HIGH_PRIORITY = 128;
                public static final int FLAG_INSISTENT = 4;
                public static final int FLAG_LOCAL_ONLY = 256;
                public static final int FLAG_NO_CLEAR = 32;
                public static final int FLAG_ONGOING_EVENT = 2;
                public static final int FLAG_ONLY_ALERT_ONCE = 8;
                public static final int FLAG_SHOW_LIGHTS = 1;
                public static final int FOREGROUND_SERVICE_DEFAULT = 0;
                public static final int FOREGROUND_SERVICE_DEFERRED = 2;
                public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
                public static final int GROUP_ALERT_ALL = 0;
                public static final int GROUP_ALERT_CHILDREN = 2;
                public static final int GROUP_ALERT_SUMMARY = 1;
                public static final String GROUP_KEY_SILENT = "silent";
                public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
                public static final int MAX_ACTION_BUTTONS = 3;
                public static final int PRIORITY_DEFAULT = 0;
                public static final int PRIORITY_HIGH = 1;
                public static final int PRIORITY_LOW = -1;
                public static final int PRIORITY_MAX = 2;
                public static final int PRIORITY_MIN = -2;
                public static final int STREAM_DEFAULT = -1;
                private static final String TAG = "NotifCompat";
                public static final int VISIBILITY_PRIVATE = 0;
                public static final int VISIBILITY_PUBLIC = 1;
                public static final int VISIBILITY_SECRET = -1;

                @Deprecated
                public NotificationCompat() {
                }

                public static yn1 getAction(Notification notification, int i) {
/* 5 */             return getActionCompatFromAction(notification.actions[i]);
                }

                public static yn1 getActionCompatFromAction(Notification.Action action) {
                    g32[] g32VarArr;
                    int i;
/* 3 */             RemoteInput[] remoteInputArrM10413g = zn1.m10413g(action);
/* 9 */             IconCompat iconCompatM4017a = null;
/* 11 */            if (remoteInputArrM10413g == null) {
/* 13 */                g32VarArr = null;
                    } else {
/* 16 */                g32[] g32VarArr2 = new g32[remoteInputArrM10413g.length];
/* 20 */                for (int i2 = 0; i2 < remoteInputArrM10413g.length; i2++) {
/* 22 */                    RemoteInput remoteInput = remoteInputArrM10413g[i2];
/* 60 */                    g32VarArr2[i2] = new g32(zn1.m10414h(remoteInput), zn1.m10412f(remoteInput), zn1.m10408b(remoteInput), zn1.m10407a(remoteInput), Build.VERSION.SDK_INT >= 29 ? eo1.m3528c(remoteInput) : 0, zn1.m10410d(remoteInput), null);
                        }
/* 65 */                g32VarArr = g32VarArr2;
                    }
/* 88 */            boolean z = zn1.m10409c(action).getBoolean("android.support.allowGeneratedReplies") || bo1.m1402a(action);
/* 95 */            boolean z2 = zn1.m10409c(action).getBoolean("android.support.action.showsUserInterface", true);
/* 99 */            int i3 = Build.VERSION.SDK_INT;
/* 117 */           int iM3166a = i3 >= 28 ? do1.m3166a(action) : zn1.m10409c(action).getInt("android.support.action.semanticAction", 0);
/* 131 */           boolean zM3530e = i3 >= 29 ? eo1.m3530e(action) : false;
/* 137 */           boolean zM3801a = i3 >= 31 ? fo1.m3801a(action) : false;
/* 147 */           if (ao1.m1147a(action) == null && (i = action.icon) != 0) {
/* 163 */               return new yn1(i, action.title, action.actionIntent, zn1.m10409c(action), g32VarArr, z, iM3166a, z2, zM3530e, zM3801a);
                    }
/* 171 */           if (ao1.m1147a(action) != null) {
/* 175 */               Icon iconM1147a = ao1.m1147a(action);
/* 179 */               PorterDuff.Mode mode = IconCompat.f1245k;
/* 186 */               if (gv0.m4020d(iconM1147a) != 2 || gv0.m4018b(iconM1147a) != 0) {
/* 195 */                   iconCompatM4017a = gv0.m4017a(iconM1147a);
                        }
                    }
/* 210 */           return new yn1(iconCompatM4017a, action.title, action.actionIntent, zn1.m10409c(action), g32VarArr, z, iM3166a, z2, zM3530e, zM3801a);
                }

                public static int getActionCount(Notification notification) {
/* 1 */             Notification.Action[] actionArr = notification.actions;
/* 3 */             if (actionArr != null) {
/* 5 */                 return actionArr.length;
                    }
/* 7 */             return 0;
                }

                public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
/* 5 */             if (Build.VERSION.SDK_INT >= 29) {
/* 7 */                 return eo1.m3526a(notification);
                    }
/* 12 */            return false;
                }

                public static boolean getAutoCancel(Notification notification) {
                    return (notification.flags & 16) != 0;
                }

                public static int getBadgeIconType(Notification notification) {
/* 5 */             if (Build.VERSION.SDK_INT >= 26) {
/* 7 */                 return co1.m1733a(notification);
                    }
/* 12 */            return 0;
                }

                public static no1 getBubbleMetadata(Notification notification) {
                    Notification.BubbleMetadata bubbleMetadataM3527b;
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 6 */             if (i >= 29 && (bubbleMetadataM3527b = eo1.m3527b(notification)) != null) {
/* 17 */                if (i >= 30) {
/* 19 */                    return lo1.m6514a(bubbleMetadataM3527b);
                        }
/* 24 */                if (i == 29) {
/* 26 */                    return ko1.m6171a(bubbleMetadataM3527b);
                        }
                    }
/* 3 */             return null;
                }

                public static String getCategory(Notification notification) {
/* 1 */             return notification.category;
                }

                public static String getChannelId(Notification notification) {
/* 5 */             if (Build.VERSION.SDK_INT >= 26) {
/* 7 */                 return co1.m1734b(notification);
                    }
/* 12 */            return null;
                }

                public static int getColor(Notification notification) {
/* 1 */             return notification.color;
                }

                public static CharSequence getContentInfo(Notification notification) {
/* 5 */             return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
                }

                public static CharSequence getContentText(Notification notification) {
/* 5 */             return notification.extras.getCharSequence(EXTRA_TEXT);
                }

                public static CharSequence getContentTitle(Notification notification) {
/* 5 */             return notification.extras.getCharSequence(EXTRA_TITLE);
                }

                public static Bundle getExtras(Notification notification) {
/* 1 */             return notification.extras;
                }

                public static String getGroup(Notification notification) {
/* 1 */             return zn1.m10411e(notification);
                }

                public static int getGroupAlertBehavior(Notification notification) {
/* 5 */             if (Build.VERSION.SDK_INT >= 26) {
/* 7 */                 return co1.m1735c(notification);
                    }
/* 12 */            return 0;
                }

                public static boolean getHighPriority(Notification notification) {
                    return (notification.flags & 128) != 0;
                }

                public static List<yn1> getInvisibleActions(Notification notification) {
                    Bundle bundle;
                    Bundle[] bundleArr;
                    Bundle[] bundleArr2;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
/* 16 */            if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
/* 34 */                for (int i = 0; i < bundle.size(); i++) {
/* 40 */                    Bundle bundle3 = bundle.getBundle(Integer.toString(i));
/* 46 */                    Bundle bundle4 = bundle3.getBundle("extras");
/* 60 */                    boolean z = bundle4 != null ? bundle4.getBoolean("android.support.allowGeneratedReplies", false) : false;
/* 65 */                    int i2 = bundle3.getInt("icon");
/* 71 */                    CharSequence charSequence = bundle3.getCharSequence("title");
/* 82 */                    PendingIntent pendingIntent = (PendingIntent) bundle3.getParcelable("actionIntent");
/* 84 */                    Bundle bundle5 = bundle3.getBundle("extras");
/* 90 */                    Parcelable[] parcelableArray = bundle3.getParcelableArray("remoteInputs");
/* 98 */                    if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
/* 114 */                       bundleArr = (Bundle[]) parcelableArray;
                            } else {
/* 108 */                       bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
/* 110 */                       bundle3.putParcelableArray("remoteInputs", bundleArr);
                            }
/* 116 */                   g32[] g32VarArrM6032E = kb1.m6032E(bundleArr);
/* 122 */                   Parcelable[] parcelableArray2 = bundle3.getParcelableArray("dataOnlyRemoteInputs");
/* 128 */                   if ((parcelableArray2 instanceof Bundle[]) || parcelableArray2 == null) {
/* 144 */                       bundleArr2 = (Bundle[]) parcelableArray2;
                            } else {
/* 138 */                       bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArray2, parcelableArray2.length, Bundle[].class);
/* 140 */                       bundle3.putParcelableArray("dataOnlyRemoteInputs", bundleArr2);
                            }
/* 146 */                   kb1.m6032E(bundleArr2);
/* 168 */                   arrayList.add(new yn1(i2, charSequence, pendingIntent, bundle5, g32VarArrM6032E, z, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false, false));
                        }
                    }
/* 175 */           return arrayList;
                }

                public static boolean getLocalOnly(Notification notification) {
                    return (notification.flags & FLAG_LOCAL_ONLY) != 0;
                }

                public static x91 getLocusId(Notification notification) {
                    LocusId locusIdM3529d;
/* 6 */             if (Build.VERSION.SDK_INT >= 29 && (locusIdM3529d = eo1.m3529d(notification)) != null) {
/* 17 */                String strM9487b = w91.m9487b(locusIdM3529d);
/* 25 */                if (!TextUtils.isEmpty(strM9487b)) {
/* 27 */                    return new x91(strM9487b);
                        }
/* 33 */                C1951n4.m6859j("id cannot be empty");
                    }
/* 5 */             return null;
                }

                public static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
/* 1 */             Parcelable[] parcelableArray = bundle.getParcelableArray(str);
/* 7 */             if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
/* 32 */                return (Notification[]) parcelableArray;
                    }
/* 13 */            Notification[] notificationArr = new Notification[parcelableArray.length];
/* 17 */            for (int i = 0; i < parcelableArray.length; i++) {
/* 23 */                notificationArr[i] = (Notification) parcelableArray[i];
                    }
/* 28 */            bundle.putParcelableArray(str, notificationArr);
/* 31 */            return notificationArr;
                }

                public static boolean getOngoing(Notification notification) {
                    return (notification.flags & 2) != 0;
                }

                public static boolean getOnlyAlertOnce(Notification notification) {
                    return (notification.flags & 8) != 0;
                }

                public static List<xr1> getPeople(Notification notification) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 10 */            if (Build.VERSION.SDK_INT >= 28) {
/* 16 */                ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
/* 20 */                if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
/* 28 */                    Iterator it = parcelableArrayList.iterator();
/* 36 */                    while (it.hasNext()) {
/* 50 */                        arrayList.add(wr1.m9608a(sk0.m8526d(it.next())));
                            }
                        }
                    } else {
/* 58 */                String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
/* 62 */                if (stringArray != null && stringArray.length != 0) {
/* 70 */                    for (String str : stringArray) {
/* 76 */                        xr1 xr1Var = new xr1();
/* 80 */                        xr1Var.f19333a = null;
/* 82 */                        xr1Var.f19334b = null;
/* 84 */                        xr1Var.f19335c = str;
/* 86 */                        xr1Var.f19336d = null;
/* 88 */                        xr1Var.f19337e = false;
/* 90 */                        xr1Var.f19338f = false;
/* 92 */                        arrayList.add(xr1Var);
                            }
                        }
                    }
/* 98 */            return arrayList;
                }

                public static Notification getPublicVersion(Notification notification) {
/* 1 */             return notification.publicVersion;
                }

                public static CharSequence getSettingsText(Notification notification) {
/* 5 */             if (Build.VERSION.SDK_INT >= 26) {
/* 7 */                 return co1.m1736d(notification);
                    }
/* 12 */            return null;
                }

                public static String getShortcutId(Notification notification) {
/* 5 */             if (Build.VERSION.SDK_INT >= 26) {
/* 7 */                 return co1.m1737e(notification);
                    }
/* 12 */            return null;
                }

                public static boolean getShowWhen(Notification notification) {
/* 5 */             return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
                }

                public static String getSortKey(Notification notification) {
/* 1 */             return zn1.m10415i(notification);
                }

                public static CharSequence getSubText(Notification notification) {
/* 5 */             return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
                }

                public static long getTimeoutAfter(Notification notification) {
/* 5 */             if (Build.VERSION.SDK_INT >= 26) {
/* 7 */                 return co1.m1738f(notification);
                    }
/* 12 */            return 0L;
                }

                public static boolean getUsesChronometer(Notification notification) {
/* 5 */             return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
                }

                public static int getVisibility(Notification notification) {
/* 1 */             return notification.visibility;
                }

                public static boolean isGroupSummary(Notification notification) {
                    return (notification.flags & FLAG_GROUP_SUMMARY) != 0;
                }

                public static Bitmap reduceLargeIconSize(Context context, Bitmap bitmap) {
/* 1 */             if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
/* 93 */                return bitmap;
                    }
/* 10 */            Resources resources = context.getResources();
/* 16 */            int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_width);
/* 22 */            int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_height);
/* 30 */            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
/* 38 */                return bitmap;
                    }
/* 62 */            double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
/* 88 */            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
