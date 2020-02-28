package Serveur;

public interface IObserverPartition {
	//est notifié quand une partition est ajouté par le serveur
	void Notify(Partition partition);
}
