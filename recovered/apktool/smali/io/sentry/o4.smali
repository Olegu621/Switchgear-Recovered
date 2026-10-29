.class public final enum Lio/sentry/o4;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/o4;

.field public static final enum ARRAY:Lio/sentry/o4;

.field public static final enum BOOLEAN:Lio/sentry/o4;

.field public static final enum DOUBLE:Lio/sentry/o4;

.field public static final enum INTEGER:Lio/sentry/o4;

.field public static final enum STRING:Lio/sentry/o4;


# direct methods
.method private static synthetic $values()[Lio/sentry/o4;
    .locals 5

    .line 1
    sget-object v0, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/o4;->BOOLEAN:Lio/sentry/o4;

    .line 4
    .line 5
    sget-object v2, Lio/sentry/o4;->INTEGER:Lio/sentry/o4;

    .line 6
    .line 7
    sget-object v3, Lio/sentry/o4;->DOUBLE:Lio/sentry/o4;

    .line 8
    .line 9
    sget-object v4, Lio/sentry/o4;->ARRAY:Lio/sentry/o4;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lio/sentry/o4;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/o4;

    .line 2
    .line 3
    const-string v1, "STRING"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/sentry/o4;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 10
    .line 11
    new-instance v0, Lio/sentry/o4;

    .line 12
    .line 13
    const-string v1, "BOOLEAN"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lio/sentry/o4;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/sentry/o4;->BOOLEAN:Lio/sentry/o4;

    .line 20
    .line 21
    new-instance v0, Lio/sentry/o4;

    .line 22
    .line 23
    const-string v1, "INTEGER"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lio/sentry/o4;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lio/sentry/o4;->INTEGER:Lio/sentry/o4;

    .line 30
    .line 31
    new-instance v0, Lio/sentry/o4;

    .line 32
    .line 33
    const-string v1, "DOUBLE"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lio/sentry/o4;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lio/sentry/o4;->DOUBLE:Lio/sentry/o4;

    .line 40
    .line 41
    new-instance v0, Lio/sentry/o4;

    .line 42
    .line 43
    const-string v1, "ARRAY"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lio/sentry/o4;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lio/sentry/o4;->ARRAY:Lio/sentry/o4;

    .line 50
    .line 51
    invoke-static {}, Lio/sentry/o4;->$values()[Lio/sentry/o4;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lio/sentry/o4;->$VALUES:[Lio/sentry/o4;

    .line 56
    .line 57
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static inferFrom(Ljava/lang/Object;)Lio/sentry/o4;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lio/sentry/o4;->BOOLEAN:Lio/sentry/o4;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Integer;

    .line 9
    .line 10
    if-nez v0, :cond_5

    .line 11
    .line 12
    instance-of v0, p0, Ljava/lang/Long;

    .line 13
    .line 14
    if-nez v0, :cond_5

    .line 15
    .line 16
    instance-of v0, p0, Ljava/lang/Short;

    .line 17
    .line 18
    if-nez v0, :cond_5

    .line 19
    .line 20
    instance-of v0, p0, Ljava/lang/Byte;

    .line 21
    .line 22
    if-nez v0, :cond_5

    .line 23
    .line 24
    instance-of v0, p0, Ljava/math/BigInteger;

    .line 25
    .line 26
    if-nez v0, :cond_5

    .line 27
    .line 28
    instance-of v0, p0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    if-nez v0, :cond_5

    .line 31
    .line 32
    instance-of v0, p0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    sget-object p0, Lio/sentry/o4;->DOUBLE:Lio/sentry/o4;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    instance-of v0, p0, Ljava/util/Collection;

    .line 45
    .line 46
    if-nez v0, :cond_4

    .line 47
    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    sget-object p0, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_4
    :goto_0
    sget-object p0, Lio/sentry/o4;->ARRAY:Lio/sentry/o4;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    :goto_1
    sget-object p0, Lio/sentry/o4;->INTEGER:Lio/sentry/o4;

    .line 68
    .line 69
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/o4;
    .locals 1

    .line 1
    const-class v0, Lio/sentry/o4;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/sentry/o4;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/sentry/o4;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/o4;->$VALUES:[Lio/sentry/o4;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lio/sentry/o4;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/sentry/o4;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apiName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
