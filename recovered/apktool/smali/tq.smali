.class public abstract Ltq;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Ljq;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lq61;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v1, v2}, Lq61;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljq;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Ljq;-><init>(Ljava/util/LinkedHashSet;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Ltq;->a:Ljq;

    .line 21
    .line 22
    return-void
.end method

.method public static a(Landroid/content/Context;Lcb;Ljq;)V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "CameraValidator"

    .line 8
    .line 9
    if-lt v0, v1, :cond_1

    .line 10
    .line 11
    invoke-static {p0}, Lrq;->b(Landroid/content/Context;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lcb;->t()Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    invoke-static {p0}, Lrq;->b(Landroid/content/Context;)I

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 31
    .line 32
    .line 33
    invoke-static {v4}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    new-instance p0, Lsq;

    .line 38
    .line 39
    const-string p1, "No cameras available"

    .line 40
    .line 41
    invoke-direct {p0, p1, v2, v3}, Lsq;-><init>(Ljava/lang/String;ILjava/lang/IllegalArgumentException;)V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_1
    if-eqz p2, :cond_2

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {p2}, Ljq;->b()Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    const-string p0, "No lens facing info in the availableCamerasSelector, don\'t verify the camera lens facing."

    .line 54
    .line 55
    invoke-static {v4, p0}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catch_0
    move-exception p0

    .line 60
    const-string p1, "Cannot get lens facing from the availableCamerasSelector don\'t verify the camera lens facing."

    .line 61
    .line 62
    invoke-static {v4, p1, p0}, Lhu0;->U(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    move-object v0, v3

    .line 67
    :cond_3
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v4}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :try_start_1
    const-string v1, "android.hardware.camera"

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-ne v5, v1, :cond_5

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_1
    move-exception v1

    .line 95
    move-object v3, v1

    .line 96
    goto :goto_1

    .line 97
    :cond_4
    :goto_0
    sget-object v5, Ljq;->c:Ljq;

    .line 98
    .line 99
    invoke-virtual {p1}, Lcb;->t()Ljava/util/LinkedHashSet;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v5, v6}, Ljq;->c(Ljava/util/LinkedHashSet;)Lzp;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 104
    .line 105
    .line 106
    move v2, v1

    .line 107
    goto :goto_2

    .line 108
    :goto_1
    const-string v1, "Camera LENS_FACING_BACK verification failed"

    .line 109
    .line 110
    invoke-static {v4, v1, v3}, Lhu0;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    :goto_2
    :try_start_2
    const-string v1, "android.hardware.camera.front"

    .line 114
    .line 115
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_7

    .line 120
    .line 121
    if-eqz p2, :cond_6

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-nez p0, :cond_7

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :catch_2
    move-exception p0

    .line 131
    move-object v3, p0

    .line 132
    goto :goto_4

    .line 133
    :cond_6
    :goto_3
    sget-object p0, Ljq;->b:Ljq;

    .line 134
    .line 135
    invoke-virtual {p1}, Lcb;->t()Ljava/util/LinkedHashSet;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {p0, p2}, Ljq;->c(Ljava/util/LinkedHashSet;)Lzp;
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 140
    .line 141
    .line 142
    add-int/lit8 v2, v2, 0x1

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :goto_4
    const-string p0, "Camera LENS_FACING_FRONT verification failed"

    .line 146
    .line 147
    invoke-static {v4, p0, v3}, Lhu0;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    :cond_7
    :goto_5
    :try_start_3
    sget-object p0, Ltq;->a:Ljq;

    .line 151
    .line 152
    invoke-virtual {p1}, Lcb;->t()Ljava/util/LinkedHashSet;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p0, p2}, Ljq;->c(Ljava/util/LinkedHashSet;)Lzp;

    .line 157
    .line 158
    .line 159
    invoke-static {v4}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 160
    .line 161
    .line 162
    add-int/lit8 v2, v2, 0x1

    .line 163
    .line 164
    :catch_3
    if-nez v3, :cond_8

    .line 165
    .line 166
    return-void

    .line 167
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string p2, "Camera LensFacing verification failed, existing cameras: "

    .line 170
    .line 171
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lcb;->t()Ljava/util/LinkedHashSet;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {v4, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    new-instance p0, Lsq;

    .line 189
    .line 190
    const-string p1, "Expected camera missing from device."

    .line 191
    .line 192
    invoke-direct {p0, p1, v2, v3}, Lsq;-><init>(Ljava/lang/String;ILjava/lang/IllegalArgumentException;)V

    .line 193
    .line 194
    .line 195
    throw p0
.end method
