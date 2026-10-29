.class public final enum Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$$serializer;,
        Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;

.field public static final synthetic U:[Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

.field public static final a:Lp51;

.field public static final enum b:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

.field public static final enum c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

.field public static final enum d:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

.field public static final enum e:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

.field public static final enum f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

.field public static final enum i:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

.field public static final enum v:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

.field public static final enum w:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 2
    .line 3
    const-string v1, "ACCEPT_ALL_SERVICES"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->b:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 10
    .line 11
    new-instance v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 12
    .line 13
    const-string v2, "DENY_ALL_SERVICES"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 20
    .line 21
    new-instance v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 22
    .line 23
    const-string v3, "ESSENTIAL_CHANGE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->d:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 30
    .line 31
    new-instance v3, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 32
    .line 33
    const-string v4, "INITIAL_PAGE_LOAD"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->e:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 40
    .line 41
    new-instance v4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 42
    .line 43
    const-string v5, "NON_EU_REGION"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 50
    .line 51
    new-instance v5, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 52
    .line 53
    const-string v6, "SESSION_RESTORED"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->i:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 60
    .line 61
    new-instance v6, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 62
    .line 63
    const-string v7, "TCF_STRING_CHANGE"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v6, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->v:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 70
    .line 71
    new-instance v7, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 72
    .line 73
    const-string v8, "UPDATE_SERVICES"

    .line 74
    .line 75
    const/4 v9, 0x7

    .line 76
    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v7, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->w:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 80
    .line 81
    filled-new-array/range {v0 .. v7}, [Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->U:[Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 86
    .line 87
    new-instance v0, Lle0;

    .line 88
    .line 89
    new-instance v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    sput-object v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;

    .line 95
    .line 96
    sget-object v0, Lv51;->a:Lv51;

    .line 97
    .line 98
    sget-object v1, Lcom/usercentrics/sdk/services/deviceStorage/models/a;->a:Lcom/usercentrics/sdk/services/deviceStorage/models/a;

    .line 99
    .line 100
    invoke-static {v0, v1}, Lr51;->a(Lv51;Lkotlin/jvm/functions/Function0;)Lp51;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sput-object v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->a:Lp51;

    .line 105
    .line 106
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;
    .locals 1

    .line 1
    const-class v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;
    .locals 1

    .line 1
    sget-object v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->U:[Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 8
    .line 9
    return-object v0
.end method
