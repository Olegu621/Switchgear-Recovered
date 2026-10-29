            package android.support.v4.media.session;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public final class PlaybackStateCompat implements Parcelable {
                public static final long ACTION_FAST_FORWARD = 64;
                public static final long ACTION_PAUSE = 2;
                public static final long ACTION_PLAY = 4;
                public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024;
                public static final long ACTION_PLAY_FROM_SEARCH = 2048;
                public static final long ACTION_PLAY_FROM_URI = 8192;
                public static final long ACTION_PLAY_PAUSE = 512;
                public static final long ACTION_PREPARE = 16384;
                public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768;
                public static final long ACTION_PREPARE_FROM_SEARCH = 65536;
                public static final long ACTION_PREPARE_FROM_URI = 131072;
                public static final long ACTION_REWIND = 8;
                public static final long ACTION_SEEK_TO = 256;
                public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576;
                public static final long ACTION_SET_RATING = 128;
                public static final long ACTION_SET_REPEAT_MODE = 262144;
                public static final long ACTION_SET_SHUFFLE_MODE = 2097152;

                @Deprecated
                public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
                public static final long ACTION_SKIP_TO_NEXT = 32;
                public static final long ACTION_SKIP_TO_PREVIOUS = 16;
                public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096;
                public static final long ACTION_STOP = 1;
                public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() { // from class: android.support.v4.media.session.PlaybackStateCompat.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public PlaybackStateCompat createFromParcel(Parcel parcel) {
/* 3 */                 return new PlaybackStateCompat(parcel);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
/* 5 */             public PlaybackStateCompat[] newArray(int i) {
/* 6 */                 return new PlaybackStateCompat[i];
                    }
                };
                public static final int ERROR_CODE_ACTION_ABORTED = 10;
                public static final int ERROR_CODE_APP_ERROR = 1;
                public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
                public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
                public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
                public static final int ERROR_CODE_END_OF_QUEUE = 11;
                public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
                public static final int ERROR_CODE_NOT_SUPPORTED = 2;
                public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
                public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
                public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
                public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
                private static final int KEYCODE_MEDIA_PAUSE = 127;
                private static final int KEYCODE_MEDIA_PLAY = 126;
                public static final long PLAYBACK_POSITION_UNKNOWN = -1;
                public static final int REPEAT_MODE_ALL = 2;
                public static final int REPEAT_MODE_GROUP = 3;
                public static final int REPEAT_MODE_INVALID = -1;
                public static final int REPEAT_MODE_NONE = 0;
                public static final int REPEAT_MODE_ONE = 1;
                public static final int SHUFFLE_MODE_ALL = 1;
                public static final int SHUFFLE_MODE_GROUP = 2;
                public static final int SHUFFLE_MODE_INVALID = -1;
                public static final int SHUFFLE_MODE_NONE = 0;
                public static final int STATE_BUFFERING = 6;
                public static final int STATE_CONNECTING = 8;
                public static final int STATE_ERROR = 7;
                public static final int STATE_FAST_FORWARDING = 4;
                public static final int STATE_NONE = 0;
                public static final int STATE_PAUSED = 2;
                public static final int STATE_PLAYING = 3;
                public static final int STATE_REWINDING = 5;
                public static final int STATE_SKIPPING_TO_NEXT = 10;
                public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
                public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
                public static final int STATE_STOPPED = 1;
                final long mActions;
                final long mActiveItemId;
                final long mBufferedPosition;
                List<CustomAction> mCustomActions;
                final int mErrorCode;
                final CharSequence mErrorMessage;
                final Bundle mExtras;
                final long mPosition;
                final float mSpeed;
                final int mState;
                private Object mStateObj;
                final long mUpdateTime;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface Actions {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface ErrorCode {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface MediaKeyAction {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface RepeatMode {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface ShuffleMode {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface State {
                }

                public PlaybackStateCompat(Parcel parcel) {
/* 8 */             this.mState = parcel.readInt();
/* 14 */            this.mPosition = parcel.readLong();
/* 20 */            this.mSpeed = parcel.readFloat();
/* 26 */            this.mUpdateTime = parcel.readLong();
/* 32 */            this.mBufferedPosition = parcel.readLong();
/* 38 */            this.mActions = parcel.readLong();
/* 48 */            this.mErrorMessage = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
/* 56 */            this.mCustomActions = parcel.createTypedArrayList(CustomAction.CREATOR);
/* 62 */            this.mActiveItemId = parcel.readLong();
/* 74 */            this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
/* 80 */            this.mErrorCode = parcel.readInt();
                }

                public static PlaybackStateCompat fromPlaybackState(Object obj) {
/* 3 */             ArrayList arrayList = null;
/* 4 */             if (obj == null) {
/* 3 */                 return null;
                    }
/* 6 */             List<Object> customActions = PlaybackStateCompatApi21.getCustomActions(obj);
/* 10 */            if (customActions != null) {
/* 18 */                arrayList = new ArrayList(customActions.size());
/* 21 */                Iterator<Object> it = customActions.iterator();
/* 29 */                while (it.hasNext()) {
/* 39 */                    arrayList.add(CustomAction.fromCustomAction(it.next()));
                        }
                    }
/* 45 */            Bundle extras = PlaybackStateCompatApi22.getExtras(obj);
/* 84 */            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(PlaybackStateCompatApi21.getState(obj), PlaybackStateCompatApi21.getPosition(obj), PlaybackStateCompatApi21.getBufferedPosition(obj), PlaybackStateCompatApi21.getPlaybackSpeed(obj), PlaybackStateCompatApi21.getActions(obj), 0, PlaybackStateCompatApi21.getErrorMessage(obj), PlaybackStateCompatApi21.getLastPositionUpdateTime(obj), arrayList, PlaybackStateCompatApi21.getActiveQueueItemId(obj), extras);
/* 87 */            playbackStateCompat.mStateObj = obj;
/* 89 */            return playbackStateCompat;
                }

                public static int toKeyCode(long j) {
/* 5 */             if (j == 4) {
/* 7 */                 return 126;
                    }
/* 14 */            if (j == 2) {
/* 16 */                return 127;
                    }
/* 23 */            if (j == 32) {
/* 25 */                return 87;
                    }
/* 32 */            if (j == 16) {
/* 34 */                return 88;
                    }
/* 41 */            if (j == 1) {
/* 43 */                return 86;
                    }
/* 50 */            if (j == 64) {
/* 52 */                return 90;
                    }
/* 59 */            if (j == 8) {
/* 61 */                return 89;
                    }
                    return j == 512 ? 85 : 0;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
/* 1 */             return 0;
                }

                public long getActions() {
/* 1 */             return this.mActions;
                }

                public long getActiveQueueItemId() {
/* 1 */             return this.mActiveItemId;
                }

                public long getBufferedPosition() {
/* 1 */             return this.mBufferedPosition;
                }

                public long getCurrentPosition(Long l) {
/* 26 */            return Math.max(0L, this.mPosition + ((long) (this.mSpeed * (l != null ? l.longValue() : SystemClock.elapsedRealtime() - this.mUpdateTime))));
                }

                public List<CustomAction> getCustomActions() {
/* 1 */             return this.mCustomActions;
                }

                public int getErrorCode() {
/* 1 */             return this.mErrorCode;
                }

                public CharSequence getErrorMessage() {
/* 1 */             return this.mErrorMessage;
                }

                public Bundle getExtras() {
/* 1 */             return this.mExtras;
                }

                public long getLastPositionUpdateTime() {
/* 1 */             return this.mUpdateTime;
                }

                public float getPlaybackSpeed() {
/* 1 */             return this.mSpeed;
                }

                public Object getPlaybackState() {
                    ArrayList arrayList;
/* 5 */             if (this.mStateObj == null) {
/* 9 */                 if (this.mCustomActions != null) {
/* 19 */                    arrayList = new ArrayList(this.mCustomActions.size());
/* 24 */                    Iterator<CustomAction> it = this.mCustomActions.iterator();
/* 32 */                    while (it.hasNext()) {
/* 44 */                        arrayList.add(it.next().getCustomAction());
                            }
                        } else {
/* 50 */                    arrayList = null;
                        }
/* 76 */                this.mStateObj = PlaybackStateCompatApi22.newInstance(this.mState, this.mPosition, this.mBufferedPosition, this.mSpeed, this.mActions, this.mErrorMessage, this.mUpdateTime, arrayList, this.mActiveItemId, this.mExtras);
                    }
/* 78 */            return this.mStateObj;
                }

                public long getPosition() {
/* 1 */             return this.mPosition;
                }

                public int getState() {
/* 1 */             return this.mState;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("PlaybackState {state=");
/* 10 */            sb.append(this.mState);
/* 15 */            sb.append(", position=");
/* 20 */            sb.append(this.mPosition);
/* 25 */            sb.append(", buffered position=");
/* 30 */            sb.append(this.mBufferedPosition);
/* 35 */            sb.append(", speed=");
/* 40 */            sb.append(this.mSpeed);
/* 45 */            sb.append(", updated=");
/* 50 */            sb.append(this.mUpdateTime);
/* 55 */            sb.append(", actions=");
/* 60 */            sb.append(this.mActions);
/* 65 */            sb.append(", error code=");
/* 70 */            sb.append(this.mErrorCode);
/* 75 */            sb.append(", error message=");
/* 80 */            sb.append(this.mErrorMessage);
/* 85 */            sb.append(", custom actions=");
/* 90 */            sb.append(this.mCustomActions);
/* 95 */            sb.append(", active item id=");
/* 102 */           return fm0.m3787m(sb, this.mActiveItemId, "}");
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.mState);
/* 8 */             parcel.writeLong(this.mPosition);
/* 13 */            parcel.writeFloat(this.mSpeed);
/* 18 */            parcel.writeLong(this.mUpdateTime);
/* 23 */            parcel.writeLong(this.mBufferedPosition);
/* 28 */            parcel.writeLong(this.mActions);
/* 33 */            TextUtils.writeToParcel(this.mErrorMessage, parcel, i);
/* 38 */            parcel.writeTypedList(this.mCustomActions);
/* 43 */            parcel.writeLong(this.mActiveItemId);
/* 48 */            parcel.writeBundle(this.mExtras);
/* 53 */            parcel.writeInt(this.mErrorCode);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 4 */         public static final class Builder {
                    private long mActions;
                    private long mActiveItemId;
                    private long mBufferedPosition;
                    private final List<CustomAction> mCustomActions;
                    private int mErrorCode;
                    private CharSequence mErrorMessage;
                    private Bundle mExtras;
                    private long mPosition;
                    private float mRate;
                    private int mState;
                    private long mUpdateTime;

                    public Builder(PlaybackStateCompat playbackStateCompat) {
/* 6 */                 ArrayList arrayList = new ArrayList();
/* 9 */                 this.mCustomActions = arrayList;
/* 13 */                this.mActiveItemId = -1L;
/* 17 */                this.mState = playbackStateCompat.mState;
/* 21 */                this.mPosition = playbackStateCompat.mPosition;
/* 25 */                this.mRate = playbackStateCompat.mSpeed;
/* 29 */                this.mUpdateTime = playbackStateCompat.mUpdateTime;
/* 33 */                this.mBufferedPosition = playbackStateCompat.mBufferedPosition;
/* 37 */                this.mActions = playbackStateCompat.mActions;
/* 41 */                this.mErrorCode = playbackStateCompat.mErrorCode;
/* 45 */                this.mErrorMessage = playbackStateCompat.mErrorMessage;
/* 47 */                List<CustomAction> list = playbackStateCompat.mCustomActions;
/* 49 */                if (list != null) {
/* 51 */                    arrayList.addAll(list);
                        }
/* 56 */                this.mActiveItemId = playbackStateCompat.mActiveItemId;
/* 60 */                this.mExtras = playbackStateCompat.mExtras;
                    }

                    public Builder addCustomAction(CustomAction customAction) {
/* 1 */                 if (customAction != null) {
/* 5 */                     this.mCustomActions.add(customAction);
/* 8 */                     return this;
                        }
/* 11 */                C1951n4.m6859j("You may not add a null CustomAction to PlaybackStateCompat.");
/* 14 */                return null;
                    }

                    public PlaybackStateCompat build() {
/* 44 */                return new PlaybackStateCompat(this.mState, this.mPosition, this.mBufferedPosition, this.mRate, this.mActions, this.mErrorCode, this.mErrorMessage, this.mUpdateTime, this.mCustomActions, this.mActiveItemId, this.mExtras);
                    }

                    public Builder setActions(long j) {
/* 1 */                 this.mActions = j;
/* 3 */                 return this;
                    }

                    public Builder setActiveQueueItemId(long j) {
/* 1 */                 this.mActiveItemId = j;
/* 3 */                 return this;
                    }

                    public Builder setBufferedPosition(long j) {
/* 1 */                 this.mBufferedPosition = j;
/* 3 */                 return this;
                    }

                    public Builder setErrorMessage(int i, CharSequence charSequence) {
/* 1 */                 this.mErrorCode = i;
/* 3 */                 this.mErrorMessage = charSequence;
/* 5 */                 return this;
                    }

                    public Builder setExtras(Bundle bundle) {
/* 1 */                 this.mExtras = bundle;
/* 3 */                 return this;
                    }

                    public Builder setState(int i, long j, float f) {
/* 9 */                 return setState(i, j, f, SystemClock.elapsedRealtime());
                    }

/* 5 */             public Builder setErrorMessage(CharSequence charSequence) {
/* 6 */                 this.mErrorMessage = charSequence;
                        return this;
                    }

/* 13 */            public Builder setState(int i, long j, float f, long j2) {
/* 14 */                this.mState = i;
/* 15 */                this.mPosition = j;
/* 16 */                this.mUpdateTime = j2;
/* 17 */                this.mRate = f;
                        return this;
                    }

/* 15 */            public Builder addCustomAction(String str, String str2, int i) {
/* 16 */                return addCustomAction(new CustomAction(str, str2, i, null));
                    }

/* 62 */            public Builder() {
/* 64 */                this.mCustomActions = new ArrayList();
/* 65 */                this.mActiveItemId = -1L;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 37 */        public static final class CustomAction implements Parcelable {
                    public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() { // from class: android.support.v4.media.session.PlaybackStateCompat.CustomAction.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public CustomAction createFromParcel(Parcel parcel) {
/* 3 */                     return new CustomAction(parcel);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
/* 5 */                 public CustomAction[] newArray(int i) {
/* 6 */                     return new CustomAction[i];
                        }
                    };
                    private final String mAction;
                    private Object mCustomActionObj;
                    private final Bundle mExtras;
                    private final int mIcon;
                    private final CharSequence mName;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static final class Builder {
                        private final String mAction;
                        private Bundle mExtras;
                        private final int mIcon;
                        private final CharSequence mName;

                        public Builder(String str, CharSequence charSequence, int i) {
/* 8 */                     if (TextUtils.isEmpty(str)) {
/* 41 */                        C1951n4.m6859j("You must specify an action to build a CustomAction.");
/* 45 */                        throw null;
                            }
/* 14 */                    if (TextUtils.isEmpty(charSequence)) {
/* 34 */                        C1951n4.m6859j("You must specify a name to build a CustomAction.");
/* 38 */                        throw null;
                            }
/* 16 */                    if (i == 0) {
/* 27 */                        C1951n4.m6859j("You must specify an icon resource id to build a CustomAction.");
/* 31 */                        throw null;
                            }
/* 18 */                    this.mAction = str;
/* 20 */                    this.mName = charSequence;
/* 22 */                    this.mIcon = i;
                        }

                        public CustomAction build() {
/* 11 */                    return new CustomAction(this.mAction, this.mName, this.mIcon, this.mExtras);
                        }

                        public Builder setExtras(Bundle bundle) {
/* 1 */                     this.mExtras = bundle;
/* 3 */                     return this;
                        }
                    }

                    public CustomAction(Parcel parcel) {
/* 8 */                 this.mAction = parcel.readString();
/* 18 */                this.mName = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
/* 24 */                this.mIcon = parcel.readInt();
/* 36 */                this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
                    }

                    public static CustomAction fromCustomAction(Object obj) {
/* 1 */                 if (obj == null) {
/* 27 */                    return null;
                        }
/* 21 */                CustomAction customAction = new CustomAction(PlaybackStateCompatApi21.CustomAction.getAction(obj), PlaybackStateCompatApi21.CustomAction.getName(obj), PlaybackStateCompatApi21.CustomAction.getIcon(obj), PlaybackStateCompatApi21.CustomAction.getExtras(obj));
/* 24 */                customAction.mCustomActionObj = obj;
/* 26 */                return customAction;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
/* 1 */                 return 0;
                    }

                    public String getAction() {
/* 1 */                 return this.mAction;
                    }

                    public Object getCustomAction() {
/* 1 */                 Object obj = this.mCustomActionObj;
/* 3 */                 if (obj != null) {
/* 19 */                    return obj;
                        }
/* 13 */                Object objNewInstance = PlaybackStateCompatApi21.CustomAction.newInstance(this.mAction, this.mName, this.mIcon, this.mExtras);
/* 17 */                this.mCustomActionObj = objNewInstance;
/* 19 */                return objNewInstance;
                    }

                    public Bundle getExtras() {
/* 1 */                 return this.mExtras;
                    }

                    public int getIcon() {
/* 1 */                 return this.mIcon;
                    }

                    public CharSequence getName() {
/* 1 */                 return this.mName;
                    }

                    public String toString() {
/* 33 */                return "Action:mName='" + ((Object) this.mName) + ", mIcon=" + this.mIcon + ", mExtras=" + this.mExtras;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int i) {
/* 3 */                 parcel.writeString(this.mAction);
/* 8 */                 TextUtils.writeToParcel(this.mName, parcel, i);
/* 13 */                parcel.writeInt(this.mIcon);
/* 18 */                parcel.writeBundle(this.mExtras);
                    }

/* 38 */            public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
/* 40 */                this.mAction = str;
/* 41 */                this.mName = charSequence;
/* 42 */                this.mIcon = i;
/* 43 */                this.mExtras = bundle;
                    }
                }

/* 82 */        public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
/* 84 */            this.mState = i;
/* 85 */            this.mPosition = j;
/* 86 */            this.mBufferedPosition = j2;
/* 87 */            this.mSpeed = f;
/* 88 */            this.mActions = j3;
/* 89 */            this.mErrorCode = i2;
/* 90 */            this.mErrorMessage = charSequence;
/* 91 */            this.mUpdateTime = j4;
/* 92 */            this.mCustomActions = new ArrayList(list);
/* 93 */            this.mActiveItemId = j5;
/* 94 */            this.mExtras = bundle;
                }
            }
