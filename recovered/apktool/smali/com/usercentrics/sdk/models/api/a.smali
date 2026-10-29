.class public final Lcom/usercentrics/sdk/models/api/a;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# static fields
.field public static final a:Lcom/usercentrics/sdk/models/api/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/models/api/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lb51;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/usercentrics/sdk/models/api/a;->a:Lcom/usercentrics/sdk/models/api/a;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/models/api/ApiSettingsVersion$$serializer;->INSTANCE:Lcom/usercentrics/sdk/models/api/ApiSettingsVersion$$serializer;

    .line 2
    .line 3
    return-object p0
.end method
