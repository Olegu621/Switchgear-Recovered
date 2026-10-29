.class public final Lcom/supercell/titan/AudioAnalyticsMonitor;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;,
        Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/supercell/titan/AudioAnalyticsMonitor;",
        "",
        "Landroid/content/Context;",
        "ctx",
        "",
        "nativeHandle",
        "<init>",
        "(Landroid/content/Context;J)V",
        "",
        "start",
        "()V",
        "stop",
        "Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;",
        "getOnce",
        "()Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;",
        "Companion",
        "Snapshot",
        "ra2",
        "titan"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;

.field public static final g:Ljava/util/Map;


# instance fields
.field public final a:J

.field public final b:Landroid/content/Context;

.field public final c:Landroid/media/AudioManager;

.field public d:Lcom/supercell/titan/AudioAnalyticsMonitor$start$1;

.field public e:Z

.field public f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/supercell/titan/AudioAnalyticsMonitor;->Companion:Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Lkotlin/Pair;

    .line 20
    .line 21
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    move-object v4, v3

    .line 30
    new-instance v3, Lkotlin/Pair;

    .line 31
    .line 32
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v4, 0x1

    .line 41
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    move-object v5, v4

    .line 46
    new-instance v4, Lkotlin/Pair;

    .line 47
    .line 48
    invoke-direct {v4, v1, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 v6, 0x5

    .line 52
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    move-object v7, v5

    .line 57
    new-instance v5, Lkotlin/Pair;

    .line 58
    .line 59
    invoke-direct {v5, v6, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const/4 v6, 0x6

    .line 63
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    move-object v8, v6

    .line 68
    new-instance v6, Lkotlin/Pair;

    .line 69
    .line 70
    invoke-direct {v6, v8, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object v1, v7

    .line 74
    new-instance v7, Lkotlin/Pair;

    .line 75
    .line 76
    invoke-direct {v7, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    filled-new-array/range {v2 .. v7}, [Lkotlin/Pair;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lcom/supercell/titan/AudioAnalyticsMonitor;->g:Ljava/util/Map;

    .line 88
    .line 89
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;J)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p2, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->a:J

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->b:Landroid/content/Context;

    .line 17
    .line 18
    const-string p2, "audio"

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast p1, Landroid/media/AudioManager;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->c:Landroid/media/AudioManager;

    .line 30
    .line 31
    return-void
.end method

.method public static final a(Landroid/media/AudioDeviceInfo;)Ljava/lang/Integer;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x2

    .line 6
    if-eq p0, v0, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    if-eq p0, v1, :cond_1

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    if-eq p0, v2, :cond_1

    .line 13
    .line 14
    const/16 v0, 0x16

    .line 15
    .line 16
    if-eq p0, v0, :cond_0

    .line 17
    .line 18
    packed-switch p0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    const/4 p0, 0x5

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    :pswitch_3
    const/4 p0, 0x6

    .line 40
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_2
    const/4 p0, 0x1

    .line 51
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public static final synthetic access$buildSnapshot(Lcom/supercell/titan/AudioAnalyticsMonitor;)Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/supercell/titan/AudioAnalyticsMonitor;->b()Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getLastMuted$p(Lcom/supercell/titan/AudioAnalyticsMonitor;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final access$notifyNative(Lcom/supercell/titan/AudioAnalyticsMonitor;Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;I)V
    .locals 14

    .line 1
    sget-object v0, Lcom/supercell/titan/AudioAnalyticsMonitor;->Companion:Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->a:J

    .line 4
    .line 5
    iget v3, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->volume:F

    .line 6
    .line 7
    iget-boolean v4, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->muted:Z

    .line 8
    .line 9
    iget-boolean v5, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->muteKnown:Z

    .line 10
    .line 11
    iget-object v6, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->outputRoutes:[I

    .line 12
    .line 13
    iget-object v9, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->outputDeviceNames:[Ljava/lang/String;

    .line 14
    .line 15
    iget-object v10, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->outputChannelCounts:[I

    .line 16
    .line 17
    iget v11, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->sampleRate:I

    .line 18
    .line 19
    iget v12, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->bufferSize:I

    .line 20
    .line 21
    iget-boolean v13, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->otherMediaIsPlaying:Z

    .line 22
    .line 23
    const/4 v8, -0x1

    .line 24
    move/from16 v7, p2

    .line 25
    .line 26
    invoke-static/range {v0 .. v13}, Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;->access$updateAudioState(Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;JFZZ[III[Ljava/lang/String;[IIIZ)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final synthetic access$setLastMuted$p(Lcom/supercell/titan/AudioAnalyticsMonitor;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->f:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$updateAudioState(JFZZ[III[Ljava/lang/String;[IIIZ)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p12}, Lcom/supercell/titan/AudioAnalyticsMonitor;->updateAudioState(JFZZ[III[Ljava/lang/String;[IIIZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final native updateAudioState(JFZZ[III[Ljava/lang/String;[IIIZ)V
.end method


# virtual methods
.method public final b()Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;
    .locals 14

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->c:Landroid/media/AudioManager;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-virtual {p0, v0}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-virtual {p0, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    int-to-float v2, v2

    .line 15
    int-to-float v1, v1

    .line 16
    div-float/2addr v2, v1

    .line 17
    :goto_0
    move v4, v2

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    goto :goto_0

    .line 21
    :goto_1
    invoke-virtual {p0, v0}, Landroid/media/AudioManager;->isStreamMute(I)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v0, -0x1

    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x2

    .line 31
    invoke-virtual {p0, v2}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v3, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    array-length v6, v2

    .line 44
    const/4 v7, 0x0

    .line 45
    move v8, v7

    .line 46
    :goto_2
    if-ge v8, v6, :cond_2

    .line 47
    .line 48
    aget-object v9, v2, v8

    .line 49
    .line 50
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v9}, Lcom/supercell/titan/AudioAnalyticsMonitor;->a(Landroid/media/AudioDeviceInfo;)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    if-eqz v10, :cond_1

    .line 58
    .line 59
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const v6, 0x18

    const-string v6, ""

    .line 70
    .line 71
    if-nez v2, :cond_b

    .line 72
    .line 73
    new-instance v1, Ljava/util/ArrayList;

    .line 74
    .line 75
    const/16 v2, 0xa

    .line 76
    .line 77
    invoke-static {v3, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_3

    .line 93
    .line 94
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    check-cast v9, Landroid/media/AudioDeviceInfo;

    .line 99
    .line 100
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v9}, Lcom/supercell/titan/AudioAnalyticsMonitor;->a(Landroid/media/AudioDeviceInfo;)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    new-instance v8, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-static {v3, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-eqz v10, :cond_6

    .line 132
    .line 133
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    check-cast v10, Landroid/media/AudioDeviceInfo;

    .line 138
    .line 139
    invoke-virtual {v10}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    if-eqz v10, :cond_4

    .line 144
    .line 145
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    if-nez v10, :cond_5

    .line 150
    .line 151
    :cond_4
    move-object v10, v6

    .line 152
    :cond_5
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_6
    new-instance v6, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-static {v3, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    if-eqz v10, :cond_8

    .line 174
    .line 175
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    check-cast v10, Landroid/media/AudioDeviceInfo;

    .line 180
    .line 181
    invoke-virtual {v10}, Landroid/media/AudioDeviceInfo;->getChannelCounts()[I

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {v10}, Lqd;->k([I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    if-eqz v10, :cond_7

    .line 193
    .line 194
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    goto :goto_6

    .line 199
    :cond_7
    move v10, v0

    .line 200
    :goto_6
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_8
    new-instance v9, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-static {v3, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_a

    .line 226
    .line 227
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    check-cast v3, Landroid/media/AudioDeviceInfo;

    .line 232
    .line 233
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getSampleRates()[I

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static {v3}, Lqd;->k([I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    if-eqz v3, :cond_9

    .line 245
    .line 246
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    goto :goto_8

    .line 251
    :cond_9
    move v3, v0

    .line 252
    :goto_8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_a
    new-instance v2, Lra2;

    .line 261
    .line 262
    invoke-direct {v2, v1, v8, v6, v9}, Lra2;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 263
    .line 264
    .line 265
    goto :goto_9

    .line 266
    :cond_b
    new-instance v2, Lra2;

    .line 267
    .line 268
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-static {v3}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-static {v6}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    invoke-static {v1}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-static {v1}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-direct {v2, v3, v6, v8, v1}, Lra2;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 289
    .line 290
    .line 291
    :goto_9
    iget-object v1, v2, Lra2;->a:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v1, Ljava/util/List;

    .line 294
    .line 295
    iget-object v3, v2, Lra2;->d:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v3, Ljava/util/List;

    .line 298
    .line 299
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->O(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    new-instance v6, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    :cond_c
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    if-eqz v8, :cond_d

    .line 317
    .line 318
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v8

    .line 322
    move-object v9, v8

    .line 323
    check-cast v9, Lkotlin/Pair;

    .line 324
    .line 325
    iget-object v9, v9, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v9, Ljava/lang/Number;

    .line 328
    .line 329
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result v9

    .line 333
    if-lez v9, :cond_c

    .line 334
    .line 335
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    goto :goto_a

    .line 339
    :cond_d
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    const/4 v8, 0x0

    .line 348
    if-nez v6, :cond_e

    .line 349
    .line 350
    move-object v6, v8

    .line 351
    goto :goto_d

    .line 352
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    if-nez v9, :cond_f

    .line 361
    .line 362
    goto :goto_d

    .line 363
    :cond_f
    move-object v9, v6

    .line 364
    check-cast v9, Lkotlin/Pair;

    .line 365
    .line 366
    iget-object v9, v9, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v9, Ljava/lang/Number;

    .line 369
    .line 370
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 375
    .line 376
    .line 377
    move-result-object v9

    .line 378
    sget-object v10, Lcom/supercell/titan/AudioAnalyticsMonitor;->g:Ljava/util/Map;

    .line 379
    .line 380
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v9

    .line 384
    check-cast v9, Ljava/lang/Integer;

    .line 385
    .line 386
    const v11, 0x7fffffff

    .line 387
    .line 388
    .line 389
    if-eqz v9, :cond_10

    .line 390
    .line 391
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 392
    .line 393
    .line 394
    move-result v9

    .line 395
    goto :goto_b

    .line 396
    :cond_10
    move v9, v11

    .line 397
    :cond_11
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v12

    .line 401
    move-object v13, v12

    .line 402
    check-cast v13, Lkotlin/Pair;

    .line 403
    .line 404
    iget-object v13, v13, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v13, Ljava/lang/Number;

    .line 407
    .line 408
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 409
    .line 410
    .line 411
    move-result v13

    .line 412
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object v13

    .line 416
    invoke-interface {v10, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v13

    .line 420
    check-cast v13, Ljava/lang/Integer;

    .line 421
    .line 422
    if-eqz v13, :cond_12

    .line 423
    .line 424
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 425
    .line 426
    .line 427
    move-result v13

    .line 428
    goto :goto_c

    .line 429
    :cond_12
    move v13, v11

    .line 430
    :goto_c
    if-le v9, v13, :cond_13

    .line 431
    .line 432
    move-object v6, v12

    .line 433
    move v9, v13

    .line 434
    :cond_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 435
    .line 436
    .line 437
    move-result v12

    .line 438
    if-nez v12, :cond_11

    .line 439
    .line 440
    :goto_d
    check-cast v6, Lkotlin/Pair;

    .line 441
    .line 442
    if-eqz v6, :cond_14

    .line 443
    .line 444
    iget-object v3, v6, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v3, Ljava/lang/Number;

    .line 447
    .line 448
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 449
    .line 450
    .line 451
    move-result v3

    .line 452
    :goto_e
    move v10, v3

    .line 453
    goto :goto_f

    .line 454
    :cond_14
    const v3, 0x19

    const-string v3, "android.media.property.OUTPUT_SAMPLE_RATE"

    .line 455
    .line 456
    invoke-virtual {p0, v3}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    if-eqz v3, :cond_15

    .line 461
    .line 462
    invoke-static {v3}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    :cond_15
    if-eqz v8, :cond_16

    .line 467
    .line 468
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    goto :goto_e

    .line 473
    :cond_16
    move v10, v0

    .line 474
    :goto_f
    const v3, 0x1a

    const-string v3, "android.media.property.OUTPUT_FRAMES_PER_BUFFER"

    .line 475
    .line 476
    invoke-virtual {p0, v3}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    if-eqz v3, :cond_17

    .line 481
    .line 482
    invoke-static {v3}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    if-eqz v3, :cond_17

    .line 487
    .line 488
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    :cond_17
    move v11, v0

    .line 493
    invoke-virtual {p0}, Landroid/media/AudioManager;->isMusicActive()Z

    .line 494
    .line 495
    .line 496
    move-result v12

    .line 497
    new-instance v3, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;

    .line 498
    .line 499
    move v13, v7

    .line 500
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->J(Ljava/util/List;)[I

    .line 501
    .line 502
    .line 503
    move-result-object v7

    .line 504
    iget-object p0, v2, Lra2;->b:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast p0, Ljava/util/List;

    .line 507
    .line 508
    new-array v0, v13, [Ljava/lang/String;

    .line 509
    .line 510
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    move-object v8, p0

    .line 515
    check-cast v8, [Ljava/lang/String;

    .line 516
    .line 517
    iget-object p0, v2, Lra2;->c:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast p0, Ljava/util/List;

    .line 520
    .line 521
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->J(Ljava/util/List;)[I

    .line 522
    .line 523
    .line 524
    move-result-object v9

    .line 525
    const/4 v6, 0x1

    .line 526
    invoke-direct/range {v3 .. v12}, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;-><init>(FZZ[I[Ljava/lang/String;[IIIZ)V

    .line 527
    .line 528
    .line 529
    return-object v3
.end method

.method public final getOnce()Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/supercell/titan/AudioAnalyticsMonitor;->b()Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final start()V
    .locals 15

    .line 1
    iget-boolean v0, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->e:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/supercell/titan/AudioAnalyticsMonitor;->b()Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean v5, v0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->muted:Z

    .line 14
    .line 15
    iput-boolean v5, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->f:Z

    .line 16
    .line 17
    sget-object v1, Lcom/supercell/titan/AudioAnalyticsMonitor;->Companion:Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;

    .line 18
    .line 19
    iget v4, v0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->volume:F

    .line 20
    .line 21
    iget-boolean v6, v0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->muteKnown:Z

    .line 22
    .line 23
    iget-object v7, v0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->outputRoutes:[I

    .line 24
    .line 25
    iget-object v10, v0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->outputDeviceNames:[Ljava/lang/String;

    .line 26
    .line 27
    iget-object v11, v0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->outputChannelCounts:[I

    .line 28
    .line 29
    iget v12, v0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->sampleRate:I

    .line 30
    .line 31
    iget v13, v0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->bufferSize:I

    .line 32
    .line 33
    iget-boolean v14, v0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->otherMediaIsPlaying:Z

    .line 34
    .line 35
    iget-wide v2, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->a:J

    .line 36
    .line 37
    const/16 v8, 0x8

    .line 38
    .line 39
    const/4 v9, -0x1

    .line 40
    invoke-static/range {v1 .. v14}, Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;->access$updateAudioState(Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;JFZZ[III[Ljava/lang/String;[IIIZ)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Landroid/content/IntentFilter;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 46
    .line 47
    .line 48
    const v1, 0x1b

    const-string v1, "android.media.VOLUME_CHANGED_ACTION"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const v1, 0x1c

    const-string v1, "android.intent.action.HEADSET_PLUG"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const v1, 0x1d

    const-string v1, "android.media.AUDIO_BECOMING_NOISY"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v1, Lcom/supercell/titan/AudioAnalyticsMonitor$start$1;

    .line 64
    .line 65
    invoke-direct {v1, p0}, Lcom/supercell/titan/AudioAnalyticsMonitor$start$1;-><init>(Lcom/supercell/titan/AudioAnalyticsMonitor;)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->d:Lcom/supercell/titan/AudioAnalyticsMonitor$start$1;

    .line 69
    .line 70
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 71
    .line 72
    const/16 v3, 0x21

    .line 73
    .line 74
    iget-object p0, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->b:Landroid/content/Context;

    .line 75
    .line 76
    if-lt v2, v3, :cond_1

    .line 77
    .line 78
    invoke-static {p0, v1, v0}, Lp0;->m(Landroid/content/Context;Lcom/supercell/titan/AudioAnalyticsMonitor$start$1;Landroid/content/IntentFilter;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_1
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final stop()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->e:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->d:Lcom/supercell/titan/AudioAnalyticsMonitor$start$1;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->b:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lcom/supercell/titan/AudioAnalyticsMonitor;->d:Lcom/supercell/titan/AudioAnalyticsMonitor$start$1;

    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method
