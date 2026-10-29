.class public final enum Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/quago/mobile/sdk/QuagoSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LogLevel"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

.field public static final enum DEBUG:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

.field public static final enum DISABLED:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

.field private static final ENUMS_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum ERROR:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

.field public static final enum INFO:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

.field public static final enum VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

.field public static final enum WARNING:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;


# instance fields
.field public final priority:I


# direct methods
.method private static synthetic $values()[Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;
    .locals 6

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 2
    .line 3
    sget-object v1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->DEBUG:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 4
    .line 5
    sget-object v2, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->INFO:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 6
    .line 7
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->WARNING:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 8
    .line 9
    sget-object v4, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->ERROR:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 10
    .line 11
    sget-object v5, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->DISABLED:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 2
    .line 3
    const-string v1, "VERBOSE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 11
    .line 12
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 13
    .line 14
    const-string v1, "DEBUG"

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v5, 0x3

    .line 18
    invoke-direct {v0, v1, v4, v5}, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->DEBUG:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 22
    .line 23
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 24
    .line 25
    const-string v1, "INFO"

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    invoke-direct {v0, v1, v3, v4}, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->INFO:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 32
    .line 33
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 34
    .line 35
    const-string v1, "WARNING"

    .line 36
    .line 37
    const/4 v3, 0x5

    .line 38
    invoke-direct {v0, v1, v5, v3}, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->WARNING:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 42
    .line 43
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 44
    .line 45
    const-string v1, "ERROR"

    .line 46
    .line 47
    const/4 v5, 0x6

    .line 48
    invoke-direct {v0, v1, v4, v5}, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->ERROR:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 52
    .line 53
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 54
    .line 55
    const-string v1, "DISABLED"

    .line 56
    .line 57
    const/16 v4, 0xa

    .line 58
    .line 59
    invoke-direct {v0, v1, v3, v4}, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;-><init>(Ljava/lang/String;II)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->DISABLED:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 63
    .line 64
    invoke-static {}, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->$values()[Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->$VALUES:[Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 69
    .line 70
    new-instance v0, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->values()[Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    array-length v3, v1

    .line 80
    :goto_0
    if-ge v2, v3, :cond_0

    .line 81
    .line 82
    aget-object v4, v1, v2

    .line 83
    .line 84
    iget v5, v4, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    .line 85
    .line 86
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->ENUMS_MAP:Ljava/util/Map;

    .line 101
    .line 102
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
    iput p3, p0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    .line 5
    .line 6
    return-void
.end method

.method public static getByPriority(I)Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;
    .locals 1

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->ENUMS_MAP:Ljava/util/Map;

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
    check-cast p0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 12
    .line 13
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;
    .locals 1

    .line 1
    const-class v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;
    .locals 1

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->$VALUES:[Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 8
    .line 9
    return-object v0
.end method
