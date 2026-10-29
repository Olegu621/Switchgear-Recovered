.class public Lorg/fmod/AudioDevice;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field private mTrack:Landroid/media/AudioTrack;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    .line 6
    .line 7
    return-void
.end method

.method private fetchChannelConfigFromCount(I)I
    .locals 1

    .line 1
    const/4 p0, 0x1

    .line 2
    const/4 v0, 0x2

    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    if-ne p1, v0, :cond_1

    .line 7
    .line 8
    const/4 p0, 0x3

    .line 9
    return p0

    .line 10
    :cond_1
    const/4 p0, 0x6

    .line 11
    if-ne p1, p0, :cond_2

    .line 12
    .line 13
    const/16 p0, 0xfc

    .line 14
    .line 15
    return p0

    .line 16
    :cond_2
    const/16 p0, 0x8

    .line 17
    .line 18
    if-ne p1, p0, :cond_3

    .line 19
    .line 20
    const/16 p0, 0x18fc

    .line 21
    .line 22
    return p0

    .line 23
    :cond_3
    const/4 p0, 0x0

    .line 24
    return p0
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    const-string v0, "fmod"

    .line 8
    .line 9
    const-string v1, "AudioDevice::init : AudioTrack stop caused IllegalStateException"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    :goto_0
    iget-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    .line 21
    .line 22
    return-void
.end method

.method public init(IIII)Z
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Lorg/fmod/AudioDevice;->fetchChannelConfigFromCount(I)I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-static {p2, v3, v0}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v7, "fmod"

    .line 11
    .line 12
    if-gez v1, :cond_0

    .line 13
    .line 14
    const-string v2, "AudioDevice::init : Couldn\'t query minimum buffer size, possibly unsupported sample rate or channel count"

    .line 15
    .line 16
    invoke-static {v7, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    :cond_0
    mul-int/2addr p3, p4

    .line 20
    mul-int/2addr p3, p1

    .line 21
    mul-int/2addr p3, v0

    .line 22
    if-le p3, v1, :cond_1

    .line 23
    .line 24
    move v5, p3

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v5, v1

    .line 27
    :goto_0
    const/4 p1, 0x0

    .line 28
    :try_start_0
    new-instance v0, Landroid/media/AudioTrack;

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    const/4 v6, 0x1

    .line 32
    const/4 v1, 0x3

    .line 33
    move v2, p2

    .line 34
    invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 38
    .line 39
    :try_start_1
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :catch_0
    const-string p2, "AudioDevice::init : AudioTrack play caused IllegalStateException"

    .line 45
    .line 46
    invoke-static {v7, p2}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/media/AudioTrack;->release()V

    .line 52
    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    iput-object p2, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    .line 56
    .line 57
    return p1

    .line 58
    :catch_1
    const-string p0, "AudioDevice::init : AudioTrack creation caused IllegalArgumentException"

    .line 59
    .line 60
    invoke-static {v7, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    return p1
.end method

.method public write([SI)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0, p2}, Landroid/media/AudioTrack;->write([SII)I

    .line 5
    .line 6
    .line 7
    return-void
.end method
