.class public final Lcom/google/firebase/messaging/RemoteMessage;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/messaging/RemoteMessage;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/os/Bundle;

.field public b:Lid;

.field public c:Ltf;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqd3;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lqd3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/firebase/messaging/RemoteMessage;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/firebase/messaging/RemoteMessage;->a:Landroid/os/Bundle;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final D1()Ljava/util/Map;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage;->b:Lid;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Lid;

    .line 6
    .line 7
    invoke-direct {v0}, Lle2;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/firebase/messaging/RemoteMessage;->a:Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    instance-of v5, v4, Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    check-cast v4, Ljava/lang/String;

    .line 41
    .line 42
    const-string v5, "google."

    .line 43
    .line 44
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v5, :cond_0

    .line 49
    .line 50
    const-string v5, "gcm."

    .line 51
    .line 52
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_0

    .line 57
    .line 58
    const-string v5, "from"

    .line 59
    .line 60
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-nez v5, :cond_0

    .line 65
    .line 66
    const-string v5, "message_type"

    .line 67
    .line 68
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_0

    .line 73
    .line 74
    const-string v5, "collapse_key"

    .line 75
    .line 76
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-nez v5, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0, v3, v4}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage;->b:Lid;

    .line 87
    .line 88
    :cond_2
    iget-object p0, p0, Lcom/google/firebase/messaging/RemoteMessage;->b:Lid;

    .line 89
    .line 90
    return-object p0
.end method

.method public final E1()Ltf;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage;->c:Ltf;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage;->a:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-static {v0}, Lts0;->z(Landroid/os/Bundle;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_7

    .line 12
    .line 13
    new-instance v1, Ltf;

    .line 14
    .line 15
    new-instance v2, Lts0;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lts0;-><init>(Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v0, "gcm.n.title"

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iput-object v3, v1, Ltf;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Lts0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Lts0;->q(Ljava/lang/String;)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v3, 0x0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    array-length v4, v0

    .line 43
    new-array v4, v4, [Ljava/lang/String;

    .line 44
    .line 45
    move v5, v3

    .line 46
    :goto_0
    array-length v6, v0

    .line 47
    if-ge v5, v6, :cond_1

    .line 48
    .line 49
    aget-object v6, v0, v5

    .line 50
    .line 51
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    aput-object v6, v4, v5

    .line 56
    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    :goto_1
    const-string v0, "gcm.n.body"

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    iput-object v4, v1, Ltf;->b:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v2, v0}, Lts0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v0}, Lts0;->q(Ljava/lang/String;)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_2
    array-length v4, v0

    .line 79
    new-array v4, v4, [Ljava/lang/String;

    .line 80
    .line 81
    :goto_2
    array-length v5, v0

    .line 82
    if-ge v3, v5, :cond_3

    .line 83
    .line 84
    aget-object v5, v0, v3

    .line 85
    .line 86
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    aput-object v5, v4, v3

    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    :goto_3
    const-string v0, "gcm.n.icon"

    .line 96
    .line 97
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    const-string v0, "gcm.n.sound2"

    .line 101
    .line 102
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_4

    .line 111
    .line 112
    const-string v0, "gcm.n.sound"

    .line 113
    .line 114
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :cond_4
    iput-object v0, v1, Ltf;->c:Ljava/lang/String;

    .line 119
    .line 120
    const-string v0, "gcm.n.tag"

    .line 121
    .line 122
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    const-string v0, "gcm.n.color"

    .line 126
    .line 127
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iput-object v0, v1, Ltf;->d:Ljava/lang/String;

    .line 132
    .line 133
    const-string v0, "gcm.n.click_action"

    .line 134
    .line 135
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    const-string v0, "gcm.n.android_channel_id"

    .line 139
    .line 140
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    const-string v0, "gcm.n.link_android"

    .line 144
    .line 145
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_5

    .line 154
    .line 155
    const-string v0, "gcm.n.link"

    .line 156
    .line 157
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :cond_5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-nez v3, :cond_6

    .line 166
    .line 167
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 168
    .line 169
    .line 170
    :cond_6
    const-string v0, "gcm.n.image"

    .line 171
    .line 172
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    const-string v0, "gcm.n.ticker"

    .line 176
    .line 177
    invoke-virtual {v2, v0}, Lts0;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    const-string v0, "gcm.n.notification_priority"

    .line 181
    .line 182
    invoke-virtual {v2, v0}, Lts0;->m(Ljava/lang/String;)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    const-string v0, "gcm.n.visibility"

    .line 186
    .line 187
    invoke-virtual {v2, v0}, Lts0;->m(Ljava/lang/String;)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    const-string v0, "gcm.n.notification_count"

    .line 191
    .line 192
    invoke-virtual {v2, v0}, Lts0;->m(Ljava/lang/String;)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    const-string v0, "gcm.n.sticky"

    .line 196
    .line 197
    invoke-virtual {v2, v0}, Lts0;->i(Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    const-string v0, "gcm.n.local_only"

    .line 201
    .line 202
    invoke-virtual {v2, v0}, Lts0;->i(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    const-string v0, "gcm.n.default_sound"

    .line 206
    .line 207
    invoke-virtual {v2, v0}, Lts0;->i(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    const-string v0, "gcm.n.default_vibrate_timings"

    .line 211
    .line 212
    invoke-virtual {v2, v0}, Lts0;->i(Ljava/lang/String;)Z

    .line 213
    .line 214
    .line 215
    const-string v0, "gcm.n.default_light_settings"

    .line 216
    .line 217
    invoke-virtual {v2, v0}, Lts0;->i(Ljava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Lts0;->s()Ljava/lang/Long;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Lts0;->o()[I

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Lts0;->y()[J

    .line 227
    .line 228
    .line 229
    iput-object v1, p0, Lcom/google/firebase/messaging/RemoteMessage;->c:Ltf;

    .line 230
    .line 231
    :cond_7
    iget-object p0, p0, Lcom/google/firebase/messaging/RemoteMessage;->c:Ltf;

    .line 232
    .line 233
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p2, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget-object p0, p0, Lcom/google/firebase/messaging/RemoteMessage;->a:Landroid/os/Bundle;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {p1, v1, p0, v0}, Lw11;->L(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
