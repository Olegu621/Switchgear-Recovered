.class public final enum Lzi1;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic b:[Lzi1;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lzi1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "uc_cache"

    .line 5
    .line 6
    const-string v3, "CACHE_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lzi1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lzi1;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-string v3, "uc_ccpa"

    .line 15
    .line 16
    const-string v4, "CCPA_TIMESTAMP"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, Lzi1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lzi1;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const-string v4, "CMP-ID"

    .line 25
    .line 26
    const-string v5, "CMP_ID"

    .line 27
    .line 28
    invoke-direct {v2, v5, v3, v4}, Lzi1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lzi1;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const-string v5, "uc_consents_buffer"

    .line 35
    .line 36
    const-string v6, "CONSENTS_BUFFER"

    .line 37
    .line 38
    invoke-direct {v3, v6, v4, v5}, Lzi1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v4, Lzi1;

    .line 42
    .line 43
    const/4 v5, 0x4

    .line 44
    const-string v6, "uc_session_timestamp"

    .line 45
    .line 46
    const-string v7, "SESSION_TIMESTAMP"

    .line 47
    .line 48
    invoke-direct {v4, v7, v5, v6}, Lzi1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v5, Lzi1;

    .line 52
    .line 53
    const/4 v6, 0x5

    .line 54
    const-string v7, "uc_settings"

    .line 55
    .line 56
    const-string v8, "SETTINGS"

    .line 57
    .line 58
    invoke-direct {v5, v8, v6, v7}, Lzi1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v6, Lzi1;

    .line 62
    .line 63
    const/4 v7, 0x6

    .line 64
    const-string v8, "uc_tcf"

    .line 65
    .line 66
    const-string v9, "TCF"

    .line 67
    .line 68
    invoke-direct {v6, v9, v7, v8}, Lzi1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v7, Lzi1;

    .line 72
    .line 73
    const/4 v8, 0x7

    .line 74
    const-string v9, "uc_session_buffer"

    .line 75
    .line 76
    const-string v10, "SESSION_BUFFER"

    .line 77
    .line 78
    invoke-direct {v7, v10, v8, v9}, Lzi1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v8, Lzi1;

    .line 82
    .line 83
    const/16 v9, 0x8

    .line 84
    .line 85
    const-string v10, "uc_user_interaction"

    .line 86
    .line 87
    const-string v11, "USER_INTERACTION"

    .line 88
    .line 89
    invoke-direct {v8, v11, v9, v10}, Lzi1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    filled-new-array/range {v0 .. v8}, [Lzi1;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sput-object v0, Lzi1;->b:[Lzi1;

    .line 97
    .line 98
    new-instance v0, Lle0;

    .line 99
    .line 100
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lzi1;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lzi1;
    .locals 1

    .line 1
    const-class v0, Lzi1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzi1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lzi1;
    .locals 1

    .line 1
    sget-object v0, Lzi1;->b:[Lzi1;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lzi1;

    .line 8
    .line 9
    return-object v0
.end method
