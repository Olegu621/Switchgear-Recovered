.class Lxhpgvfjuz/aP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxhpgvfjuz/al;


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lxhpgvfjuz/aP;

    const v1, 0x6b80

    return-void
.end method

.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxhpgvfjuz/aP;->a:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public native a()I
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lxhpgvfjuz/aP;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public native b()Z
.end method

.method public native c()I
.end method

.method public native d()I
.end method
