.class public abstract Lw6;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Ljr1;

.field public static final b:Lir1;

.field public static final c:Lt31;

.field public static final d:Lp31;

.field public static final e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.AesSivKey"

    .line 2
    .line 3
    invoke-static {v0}, Lp13;->b(Ljava/lang/String;)Lwl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljr1;

    .line 8
    .line 9
    const-class v2, Lv6;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljr1;-><init>(Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lw6;->a:Ljr1;

    .line 15
    .line 16
    new-instance v1, Lir1;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lir1;-><init>(Lwl;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lw6;->b:Lir1;

    .line 22
    .line 23
    new-instance v1, Lt31;

    .line 24
    .line 25
    const-class v2, Lr6;

    .line 26
    .line 27
    invoke-direct {v1, v2}, Lt31;-><init>(Ljava/lang/Class;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lw6;->c:Lt31;

    .line 31
    .line 32
    new-instance v1, Ln4;

    .line 33
    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-direct {v1, v2}, Ln4;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lp31;

    .line 39
    .line 40
    invoke-direct {v2, v0, v1}, Lp31;-><init>(Lwl;Lq31;)V

    .line 41
    .line 42
    .line 43
    sput-object v2, Lw6;->d:Lp31;

    .line 44
    .line 45
    new-instance v0, Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lu6;->d:Lu6;

    .line 51
    .line 52
    sget-object v2, Lwq1;->e:Lwq1;

    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    sget-object v3, Lu6;->b:Lu6;

    .line 58
    .line 59
    sget-object v4, Lwq1;->c:Lwq1;

    .line 60
    .line 61
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object v5, Lu6;->c:Lu6;

    .line 65
    .line 66
    sget-object v6, Lwq1;->f:Lwq1;

    .line 67
    .line 68
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    new-instance v0, Ljava/util/EnumMap;

    .line 75
    .line 76
    const-class v7, Lwq1;

    .line 77
    .line 78
    invoke-direct {v0, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v4, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v6, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    sget-object v1, Lwq1;->d:Lwq1;

    .line 91
    .line 92
    invoke-virtual {v0, v1, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lw6;->e:Ljava/util/Map;

    .line 100
    .line 101
    return-void
.end method
