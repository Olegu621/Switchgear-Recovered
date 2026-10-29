.class public final Lwq2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic c:[Lu21;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lsy1;

    .line 2
    .line 3
    const-class v1, Lwq2;

    .line 4
    .line 5
    const-string v2, "appId"

    .line 6
    .line 7
    const-string v3, "getAppId()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lj22;->a:Lk22;

    .line 14
    .line 15
    const-string v3, "devicePlatform"

    .line 16
    .line 17
    const-string v5, "getDevicePlatform()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-static {v2, v1, v3, v5, v4}, Lfm0;->d(Lk22;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lsy1;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Lsy1;

    .line 24
    .line 25
    const-string v5, "base64Encoding"

    .line 26
    .line 27
    const-string v6, "getBase64Encoding()Ljava/lang/Boolean;"

    .line 28
    .line 29
    invoke-direct {v3, v1, v5, v6, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lsy1;

    .line 33
    .line 34
    const-string v6, "platformContext"

    .line 35
    .line 36
    const-string v7, "getPlatformContext()Ljava/lang/Boolean;"

    .line 37
    .line 38
    invoke-direct {v5, v1, v6, v7, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lsy1;

    .line 42
    .line 43
    const-string v7, "geoLocationContext"

    .line 44
    .line 45
    const-string v8, "getGeoLocationContext()Ljava/lang/Boolean;"

    .line 46
    .line 47
    invoke-direct {v6, v1, v7, v8, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    new-instance v7, Lsy1;

    .line 51
    .line 52
    const-string v8, "sessionContext"

    .line 53
    .line 54
    const-string v9, "getSessionContext()Ljava/lang/Boolean;"

    .line 55
    .line 56
    invoke-direct {v7, v1, v8, v9, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Lsy1;

    .line 60
    .line 61
    const-string v9, "userAnonymisation"

    .line 62
    .line 63
    const-string v10, "getUserAnonymisation()Ljava/lang/Boolean;"

    .line 64
    .line 65
    invoke-direct {v8, v1, v9, v10, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    new-instance v9, Lsy1;

    .line 69
    .line 70
    const-string v10, "screenContext"

    .line 71
    .line 72
    const-string v11, "getScreenContext()Ljava/lang/Boolean;"

    .line 73
    .line 74
    invoke-direct {v9, v1, v10, v11, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    new-instance v10, Lsy1;

    .line 78
    .line 79
    const-string v11, "applicationContext"

    .line 80
    .line 81
    const-string v12, "getApplicationContext()Ljava/lang/Boolean;"

    .line 82
    .line 83
    invoke-direct {v10, v1, v11, v12, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    new-instance v11, Lsy1;

    .line 87
    .line 88
    const-string v12, "lifecycleAutotracking"

    .line 89
    .line 90
    const-string v13, "getLifecycleAutotracking()Ljava/lang/Boolean;"

    .line 91
    .line 92
    invoke-direct {v11, v1, v12, v13, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    new-instance v12, Lsy1;

    .line 96
    .line 97
    const-string v13, "screenEngagementAutotracking"

    .line 98
    .line 99
    const-string v14, "getScreenEngagementAutotracking()Ljava/lang/Boolean;"

    .line 100
    .line 101
    invoke-direct {v12, v1, v13, v14, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    new-instance v13, Lsy1;

    .line 105
    .line 106
    const-string v14, "platformContextProperties"

    .line 107
    .line 108
    const-string v15, "getPlatformContextProperties()Ljava/util/Map;"

    .line 109
    .line 110
    invoke-direct {v13, v1, v14, v15, v4}, Lsy1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    const/16 v1, 0xc

    .line 114
    .line 115
    new-array v1, v1, [Lu21;

    .line 116
    .line 117
    aput-object v0, v1, v4

    .line 118
    .line 119
    const/4 v0, 0x1

    .line 120
    aput-object v2, v1, v0

    .line 121
    .line 122
    const/4 v0, 0x2

    .line 123
    aput-object v3, v1, v0

    .line 124
    .line 125
    const/4 v0, 0x3

    .line 126
    aput-object v5, v1, v0

    .line 127
    .line 128
    const/4 v0, 0x4

    .line 129
    aput-object v6, v1, v0

    .line 130
    .line 131
    const/4 v0, 0x5

    .line 132
    aput-object v7, v1, v0

    .line 133
    .line 134
    const/4 v0, 0x6

    .line 135
    aput-object v8, v1, v0

    .line 136
    .line 137
    const/4 v0, 0x7

    .line 138
    aput-object v9, v1, v0

    .line 139
    .line 140
    const/16 v0, 0x8

    .line 141
    .line 142
    aput-object v10, v1, v0

    .line 143
    .line 144
    const/16 v0, 0x9

    .line 145
    .line 146
    aput-object v11, v1, v0

    .line 147
    .line 148
    const/16 v0, 0xa

    .line 149
    .line 150
    aput-object v12, v1, v0

    .line 151
    .line 152
    const/16 v0, 0xb

    .line 153
    .line 154
    aput-object v13, v1, v0

    .line 155
    .line 156
    sput-object v1, Lwq2;->c:[Lu21;

    .line 157
    .line 158
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbz;

    .line 5
    .line 6
    const/16 v1, 0x19

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lbz;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lmc1;->b(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lwq2;->a:Ljava/util/Map;

    .line 16
    .line 17
    new-instance p1, Lod;

    .line 18
    .line 19
    const/16 v0, 0xc

    .line 20
    .line 21
    invoke-direct {p1, p0, v0}, Lod;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lwq2;->b:Lhk2;

    .line 29
    .line 30
    return-void
.end method
