.class public final enum Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/models/api/ApiSettingsVersion$$serializer;,
        Lcom/usercentrics/sdk/models/api/ApiSettingsVersion$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/models/api/ApiSettingsVersion$Companion;

.field public static final a:Lp51;

.field public static final synthetic b:[Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;

    .line 2
    .line 3
    const-string v1, "MAJOR"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;

    .line 10
    .line 11
    const-string v2, "MINOR"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;

    .line 18
    .line 19
    const-string v3, "PATCH"

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    filled-new-array {v0, v1, v2}, [Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;->b:[Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;

    .line 30
    .line 31
    new-instance v0, Lle0;

    .line 32
    .line 33
    new-instance v0, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion$Companion;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;->Companion:Lcom/usercentrics/sdk/models/api/ApiSettingsVersion$Companion;

    .line 39
    .line 40
    sget-object v0, Lv51;->a:Lv51;

    .line 41
    .line 42
    sget-object v1, Lcom/usercentrics/sdk/models/api/a;->a:Lcom/usercentrics/sdk/models/api/a;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lr51;->a(Lv51;Lkotlin/jvm/functions/Function0;)Lp51;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;->a:Lp51;

    .line 49
    .line 50
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;
    .locals 1

    .line 1
    const-class v0, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;
    .locals 1

    .line 1
    sget-object v0, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;->b:[Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;

    .line 8
    .line 9
    return-object v0
.end method
