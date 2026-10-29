.class public final enum Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/quago/mobile/sdk/QuagoSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SensoryType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field public static final enum ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field public static final enum AMBIENT_TEMPERATURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field public static final enum BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field private static final ENUMS_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum GEOMAGNETIC_ROTATION_VECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field public static final enum GYROSCOPE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field public static final enum LIGHT:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field public static final enum MAGNETIC_FIELD:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field public static final enum PRESSURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field public static final enum PROXIMITY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

.field public static final enum STEP_DETECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;


# instance fields
.field public final type:I


# direct methods
.method private static synthetic $values()[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;
    .locals 10

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 2
    .line 3
    sget-object v1, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 4
    .line 5
    sget-object v2, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->MAGNETIC_FIELD:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 6
    .line 7
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GYROSCOPE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 8
    .line 9
    sget-object v4, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PROXIMITY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 10
    .line 11
    sget-object v5, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->LIGHT:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 12
    .line 13
    sget-object v6, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PRESSURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 14
    .line 15
    sget-object v7, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->AMBIENT_TEMPERATURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 16
    .line 17
    sget-object v8, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->STEP_DETECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 18
    .line 19
    sget-object v9, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GEOMAGNETIC_ROTATION_VECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 2
    .line 3
    const-string v1, "BATTERY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 10
    .line 11
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 12
    .line 13
    const-string v1, "ACCELEROMETER"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v0, v1, v3, v3}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->ACCELEROMETER:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 20
    .line 21
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 22
    .line 23
    const-string v1, "MAGNETIC_FIELD"

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-direct {v0, v1, v3, v3}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->MAGNETIC_FIELD:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 30
    .line 31
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 32
    .line 33
    const-string v1, "GYROSCOPE"

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    const/4 v4, 0x4

    .line 37
    invoke-direct {v0, v1, v3, v4}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GYROSCOPE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 41
    .line 42
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 43
    .line 44
    const-string v1, "PROXIMITY"

    .line 45
    .line 46
    const/16 v3, 0x8

    .line 47
    .line 48
    invoke-direct {v0, v1, v4, v3}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PROXIMITY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 52
    .line 53
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 54
    .line 55
    const-string v1, "LIGHT"

    .line 56
    .line 57
    const/4 v4, 0x5

    .line 58
    invoke-direct {v0, v1, v4, v4}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->LIGHT:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 62
    .line 63
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 64
    .line 65
    const-string v1, "PRESSURE"

    .line 66
    .line 67
    const/4 v4, 0x6

    .line 68
    invoke-direct {v0, v1, v4, v4}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->PRESSURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 72
    .line 73
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 74
    .line 75
    const/4 v1, 0x7

    .line 76
    const/16 v4, 0xd

    .line 77
    .line 78
    const-string v5, "AMBIENT_TEMPERATURE"

    .line 79
    .line 80
    invoke-direct {v0, v5, v1, v4}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;-><init>(Ljava/lang/String;II)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->AMBIENT_TEMPERATURE:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 84
    .line 85
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 86
    .line 87
    const-string v1, "STEP_DETECTOR"

    .line 88
    .line 89
    const/16 v4, 0x12

    .line 90
    .line 91
    invoke-direct {v0, v1, v3, v4}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;-><init>(Ljava/lang/String;II)V

    .line 92
    .line 93
    .line 94
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->STEP_DETECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 95
    .line 96
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 97
    .line 98
    const/16 v1, 0x9

    .line 99
    .line 100
    const/16 v3, 0x14

    .line 101
    .line 102
    const-string v4, "GEOMAGNETIC_ROTATION_VECTOR"

    .line 103
    .line 104
    invoke-direct {v0, v4, v1, v3}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;-><init>(Ljava/lang/String;II)V

    .line 105
    .line 106
    .line 107
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->GEOMAGNETIC_ROTATION_VECTOR:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 108
    .line 109
    invoke-static {}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->$values()[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->$VALUES:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 114
    .line 115
    new-instance v0, Ljava/util/HashMap;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->values()[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    array-length v3, v1

    .line 125
    :goto_0
    if-ge v2, v3, :cond_0

    .line 126
    .line 127
    aget-object v4, v1, v2

    .line 128
    .line 129
    iget v5, v4, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->type:I

    .line 130
    .line 131
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    add-int/lit8 v2, v2, 0x1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->ENUMS_MAP:Ljava/util/Map;

    .line 146
    .line 147
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->type:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(I)Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;
    .locals 1

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->ENUMS_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 12
    .line 13
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;
    .locals 1

    .line 14
    const-class v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    return-object p0
.end method

.method public static values()[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;
    .locals 1

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->$VALUES:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 8
    .line 9
    return-object v0
.end method
