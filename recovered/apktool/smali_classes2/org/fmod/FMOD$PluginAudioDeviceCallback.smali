.class Lorg/fmod/FMOD$PluginAudioDeviceCallback;
.super Landroid/media/AudioDeviceCallback;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/fmod/FMOD;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PluginAudioDeviceCallback"
.end annotation


# static fields
.field private static deviceSet:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Landroid/media/AudioDeviceInfo;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    sput-object p0, Lorg/fmod/FMOD$PluginAudioDeviceCallback;->deviceSet:Ljava/util/HashSet;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    :goto_0
    array-length v0, p1

    .line 15
    if-ge p0, v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lorg/fmod/FMOD$PluginAudioDeviceCallback;->deviceSet:Ljava/util/HashSet;

    .line 18
    .line 19
    aget-object v1, p1, p0

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 p0, p0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method


# virtual methods
.method public onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 4

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    move v0, p0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    array-length v2, p1

    .line 7
    if-ge p0, v2, :cond_3

    .line 8
    .line 9
    sget-object v2, Lorg/fmod/FMOD$PluginAudioDeviceCallback;->deviceSet:Ljava/util/HashSet;

    .line 10
    .line 11
    aget-object v3, p1, p0

    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    aget-object v2, p1, p0

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->isSource()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    move v0, v3

    .line 37
    :cond_0
    aget-object v2, p1, p0

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->isSink()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    move v1, v3

    .line 46
    :cond_1
    sget-object v2, Lorg/fmod/FMOD$PluginAudioDeviceCallback;->deviceSet:Ljava/util/HashSet;

    .line 47
    .line 48
    aget-object v3, p1, p0

    .line 49
    .line 50
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    :cond_2
    add-int/lit8 p0, p0, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move p0, v0

    .line 65
    goto :goto_1

    .line 66
    :cond_4
    move v1, p0

    .line 67
    :goto_1
    if-eqz p0, :cond_5

    .line 68
    .line 69
    invoke-static {}, Lorg/fmod/FMOD;->access$100()V

    .line 70
    .line 71
    .line 72
    :cond_5
    if-eqz v1, :cond_6

    .line 73
    .line 74
    invoke-static {}, Lorg/fmod/FMOD;->access$200()V

    .line 75
    .line 76
    .line 77
    :cond_6
    return-void
.end method

.method public onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 4

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    move v0, p0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    array-length v2, p1

    .line 7
    if-ge p0, v2, :cond_3

    .line 8
    .line 9
    sget-object v2, Lorg/fmod/FMOD$PluginAudioDeviceCallback;->deviceSet:Ljava/util/HashSet;

    .line 10
    .line 11
    aget-object v3, p1, p0

    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    aget-object v2, p1, p0

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->isSource()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    move v0, v3

    .line 37
    :cond_0
    aget-object v2, p1, p0

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->isSink()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    move v1, v3

    .line 46
    :cond_1
    sget-object v2, Lorg/fmod/FMOD$PluginAudioDeviceCallback;->deviceSet:Ljava/util/HashSet;

    .line 47
    .line 48
    aget-object v3, p1, p0

    .line 49
    .line 50
    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    :cond_2
    add-int/lit8 p0, p0, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move p0, v0

    .line 65
    goto :goto_1

    .line 66
    :cond_4
    move v1, p0

    .line 67
    :goto_1
    if-eqz p0, :cond_5

    .line 68
    .line 69
    invoke-static {}, Lorg/fmod/FMOD;->access$100()V

    .line 70
    .line 71
    .line 72
    :cond_5
    if-eqz v1, :cond_6

    .line 73
    .line 74
    invoke-static {}, Lorg/fmod/FMOD;->access$200()V

    .line 75
    .line 76
    .line 77
    :cond_6
    return-void
.end method
