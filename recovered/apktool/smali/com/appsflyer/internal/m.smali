.class public final synthetic Lcom/appsflyer/internal/m;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/Observer;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFj1tSDK;

.field public final synthetic b:Lcom/appsflyer/internal/AFf1xSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFj1tSDK;Lcom/appsflyer/internal/AFf1xSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/appsflyer/internal/m;->a:Lcom/appsflyer/internal/AFj1tSDK;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/appsflyer/internal/m;->b:Lcom/appsflyer/internal/AFf1xSDK;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final update(Ljava/util/Observable;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/m;->a:Lcom/appsflyer/internal/AFj1tSDK;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/appsflyer/internal/m;->b:Lcom/appsflyer/internal/AFf1xSDK;

    .line 4
    .line 5
    invoke-static {v0, p0, p1, p2}, Lcom/appsflyer/internal/AFf1xSDK;->a(Lcom/appsflyer/internal/AFj1tSDK;Lcom/appsflyer/internal/AFf1xSDK;Ljava/util/Observable;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
